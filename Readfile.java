import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    public static void main(String [] args){
        char[] data = new char [100];
        try{
            FileReader read = new FileReader("C:\\Users\\Sahil\\OneDrive - galgotiasuniversity.edu.in\\desktop\\Intermnship_sem8\\data1.txt");
            read.read(data);
            System.out.println(data);
            read.close();
        }
        catch(IOException e){
            System.out.println("File read successfully");
        }
    }
    
}
