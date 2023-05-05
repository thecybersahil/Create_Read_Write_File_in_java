//import java.util.*;
import java.io.IOException;
import java.io.File;
public class Createfile {
    public static void main(String[] args){
        File myFile = new File("C:\\Users\\Sahil\\OneDrive - galgotiasuniversity.edu.in\\desktop\\Intermnship_sem8\\data1.txt");
        boolean result; 
    try{
        result = myFile.createNewFile();
        if (result){
            System.out.println("file created succesfully");
        }
        else{
            System.out.println("File creation errror");
        }
     } catch (IOException ex) {
         System.out.println("file error");
    }
    

    }
}
