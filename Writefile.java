import java.io.FileWriter;
import java.io.IOException;
public class Writefile {
    public static void main(String[] args){
        String data = "101, Sahil, 19SCSE, Galgotias";
        try{
            FileWriter ot = new FileWriter("C:\\Users\\Sahil\\OneDrive - galgotiasuniversity.edu.in\\desktop\\Intermnship_sem8\\data1.txt");
            ot.write(data);
            System.out.println("Data written successfully....");
            ot.close();
        } catch (IOException e){
            System.out.println("Data write error....//");
        }
    }
    
}
