package citire;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
public class Read {
    public static void main(String[] args) {
        try{
            File file = new File("text.txt");
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        }
        catch (IOException e){
            System.out.println("A intervenit o eroare");
            e.printStackTrace();
        }
    }
}
