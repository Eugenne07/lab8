package stergere;
import java.io.File;
public class Delete {
    public static void main(String[] args) {
        File file = new File("text.txt");
        if(file.delete()){
            System.out.println("Fisierul a fost sters");
        }
        else{
            System.out.println("Fisierul NU a fost sters");
        }
    }
}
