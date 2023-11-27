package creare;

import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("text.txt");
            if(file.createNewFile()){
                System.out.println("Fisierul a fost creat " + file.getName());
            }
            else{
                System.out.println("Fisierul exista deja");
            }
        }catch (IOException e){
            System.out.println("A intervenit o eroare");
            e.printStackTrace();
        }

    }
}