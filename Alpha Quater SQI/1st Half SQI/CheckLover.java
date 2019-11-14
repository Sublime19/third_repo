import java.io.*;
import java.util.*;
import java.lang.*;

public class CheckLover 
{
  
	public static void main(String[] args)
	{

	    Scanner sca = new Scanner(new InputStreamReader(System.in));

        System.out.println("Enter yourName:  ");
        //double yourName = double.Scanner.nextLine();
        String yourName = sca.nextLine();

		System.out.println("Enter loversName:  ");
		//double loversName = double.Scanner.nextLine();
		String loversName = sca.nextLine();

		System.out.println("Welcome"+yourName+loversName);

		//int ab =System.out.println("Welcome"+yourName+loversName);

		 double ab = Math.random();

		  

		if (ab > 0.1) { 	
		  System.out.println("Marrige is certain:" );
		 	}
		else if (ab < 0.5) {
		  		System.out.println("Breakup immiment:" +ab);
				}
		else  {System.out.println("No Relationship Visible:" +ab);
									}

		//System.out.println(ab);

	}
}