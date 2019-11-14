
// Child Class

import java.util.*;
import java.io.*;
public class ControlMainClass extends ControlMultiplicationTable // child class(subclass) exteends the parent class(superclass)
{
	int option_selectApp;

	Scanner scanner = new Scanner(new InputStreamReader(System.in));

	public void Option(){

		System.out.println("Please select an Option: ");
	 	System.out.println("1. calculator");
	 	System.out.println("2. multiplicationApp");
	 	System.out.println("3. games");
	 	System.out.println("4. intelligentQuestion");
		
		option_selectApp = Integer.parseInt(scanner.nextLine());
		
		if(option_selectApp == 1) //0818 833 8284
		{
			calculator();	// calling a method 	
		}
		else if(option_selectApp == 2)
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
		else
		{	
			menu();	
			
		}	
	}
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
		public void menu()
		{
			System.out.println("You must select an Option within the range");
			Option ();
		}

}