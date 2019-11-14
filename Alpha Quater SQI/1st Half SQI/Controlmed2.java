import java.util.*;
import java.io.*;
public class Controlmed2 
	{
		public class Controlmed
		{
			int currentMethod;
			int option_selectApp;

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
 								games();
 							}
 								else if(currentMethod == 3)
 									{
 										intelligentQuestion();
 									}
 										else if(currentMethod == 4)
 											{
 												multiplicationApp();
 											}
 					}



 										else if(userinput == 2)
 												{
 													Option();
 												}
 													else
 													{ 
 												tryagain();
 										 			}
			}

		}

	}	