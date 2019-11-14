// import java.io.BufferedReader;
// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Scanner;
import java.io.*;
//import java.io.PrintWriter;
import java.util.*;

public class ReadFile2File 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean cont = true;
        String line;

        try
         {
            FileReader fileReader = new FileReader("Supernatural.txt");
            PrintWriter output = new PrintWriter("NewFile.txt");
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Enter V to paste");
            userInput = scanner.next();
            System.out.println(userInput);
            while(cont) {
                // This loop keeps asking the user until they enter the correct value which is V
                // {case insensitive}
                if (userInput.equalsIgnoreCase("V")) { // you can use [.equals] if you like to differenciate between V and v
                    cont = false; // update flag so the loop can stop since a correct value has been entered
                    while((line = bufferedReader.readLine()) != null) {
                        output.println(line);
                    }
                }
            }
            bufferedReader.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            // i'm not gonna do any error handling so i'm just gonna rethrow
            throw(e);
        }
    }
}