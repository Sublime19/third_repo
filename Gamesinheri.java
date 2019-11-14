	import java.util.*;
	import java.io.*;
	public class Gamesinheri extends ControlMainClass

	Scanner scanner = new Scanner(new InputStreamReader(System.in));
{
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
		public void games()
	{
		currentMethod = 3;

		String option_select;
		int yourAge, fathersAge, mothersAge;
		int result;

		System.out.println("Enter yourAge:  ");
	    yourAge = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter fathersAge:  ");
		fathersAge = Integer.parseInt(scanner.nextLine());

		System.out.println("Enter mothersAge:  ");
		mothersAge = Integer.parseInt(scanner.nextLine());


	 	 result =  fathersAge - yourAge;
	 	System.out.println("fathersAge:"  + result);


	 	result =  mothersAge - yourAge;
	 	System.out.println("mothersAge:" + result);
	 	tryagain();
	}

	public void menu()	
		{
			System.out.println ();
			//Option ();
		}
}	
			