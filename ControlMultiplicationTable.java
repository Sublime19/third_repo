
// Parent Class 

import java.util.*;
import java.io.*;
public class ControlMultiplicationTable
{
	int option_selectApp;
	int currentMethod;

	Scanner scanner = new Scanner(new InputStreamReader(System.in));

	public void tryagain()
	{
		System.out.println("Press 1 to try again or 2 to return to main menu");
 		int userinput = Integer.parseInt(scanner.nextLine());
 		if(userinput == 1)
 		{
 			if(currentMethod == 1)
 			{
 				calculator();
 			}
 			else if(currentMethod == 2)
 			{
 				multiplicationApp();
 			}
 			else if(currentMethod == 3)
 			{
 				games();
 			}
 			else if(currentMethod == 4)
 			{
 				intelligentQuestion();
 			}
 		}
 		else if(userinput == 2)
 		{
 			//Option();
 		}
 		else{ tryagain(); }
	}

	public void calculator()	// Declaring a method 
	{
		currentMethod = 1;

		int option_select;
		int fvalue, svalue, result;
		
	 	System.out.println("Please select an Option: ");
	 	System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Go to main menu");
		option_select = Integer.parseInt(scanner.nextLine());
		
		if(option_select == 1)
		{
			System.out.print("Enter fvalue:");
			fvalue = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter svalue:");
			svalue = Integer.parseInt(scanner.nextLine());
			result = fvalue + svalue;
			System.out.print(result);
		}
		else if(option_select == 2)
		{	
			System.out.print("Enter fvalue:");
			fvalue = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter svalue:");
			svalue = Integer.parseInt(scanner.nextLine());
			result = fvalue - svalue;
			System.out.print(result);
		}
		else if(option_select == 3)
		{	
			System.out.print("Enter fvalue:");
			fvalue = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter svalue:");
			svalue = Integer.parseInt(scanner.nextLine());
			result = fvalue * svalue;
			System.out.print(result);
		}
		else if(option_select == 4)
		{	
			System.out.print("Enter fvalue:");
			fvalue = Integer.parseInt(scanner.nextLine());
			System.out.print("Enter svalue:");
			svalue = Integer.parseInt(scanner.nextLine());
			result = fvalue / svalue;
			System.out.print(result);
		}
		else
		{
			//System.out.print("You must select a value between 1 - 4");
			calculator();
		}
		tryagain();
	}

	public void multiplicationApp()
	{
		currentMethod = 2;
		// Display the table heading
 		System.out.println("Multiplication Table");
 		System.out.println("Enter the first number");
 		int fv = Integer.parseInt(scanner.nextLine());
 		System.out.println("Enter the second number");
 		int sv = Integer.parseInt(scanner.nextLine());

		// Display the number title

 		for (int j = 1; j <= fv; j++)
 		
 			System.out.print(" " + j);

	 		System.out.println("\n");

 			// Display table body
 			for (int i = 1; i <= sv; i++)
  			{
 				System.out.print(i + " | ");
 				for (int j = 1; j <= fv; j++) 
 				{
 					// Display the product and align properly
 					System.out.printf("%4d", i * j);
 				}
 				System.out.println();
 			}
 		tryagain();
 		
	}
		public void menu()	
		{
			System.out.println ();
			//Option ();
		}
}