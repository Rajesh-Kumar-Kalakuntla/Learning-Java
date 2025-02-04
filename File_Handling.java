import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {
        //To Create a File
        //File myObj = new File("file_name.txt");
        //myObj.createNewFile();
     try {
         //To create and write a file
         FileWriter myWriter = new FileWriter("File.txt");
         myWriter.write("This File is an example of Writing To a File");
         myWriter.close();
         System.out.println("Succesfully wrote the file");
     } catch (Exception e) {
        System.out.println("An error Occured: " + "\n" + e.getMessage());
     }
     try{
     File myObj = new File("File.txt");
     Scanner myReader = new Scanner(myObj);
     while(myReader.hasNextLine()){
        //if the file contains no of data 
        String data = myReader.nextLine();
        System.out.println(data);
     }
     myReader.close();
     }catch(Exception e){
        System.out.println("An Error Occured" + e.getMessage());
     }

    }
}