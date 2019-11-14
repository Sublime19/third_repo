import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FromFile2 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        boolean cont = true;
        String line;

        try
         {
            String filename = "text.txt";
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while(cont) {
                // This loop keeps asking the user until they enter the correct value which is v
                // {case insensitive}

                System.out.println("Enter V to paste");
                userInput = scanner.next();
                System.out.println(userInput);
                if (userInput.equalsIgnoreCase("V")) { // you can use [.equals] if you like to differenciate between V and v
                    cont = false; // update flag so the loop can stop since a correct value has been entered
                    while((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            // i'm not gonna do any error handling so i'm just gonna rethrow
            throw(e);
        }
    }
}