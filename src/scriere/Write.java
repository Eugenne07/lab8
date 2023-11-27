package scriere;
import java.io.IOException;
import java.io.FileWriter;
public class Write {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.write("Fisier nou in Java");
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("A intervenit o eroare");
        }
    }
}
