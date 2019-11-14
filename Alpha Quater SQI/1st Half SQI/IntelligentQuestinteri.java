import java.util.*;
import java.io.*;

public class IntelligentQuestinteri extends Gamesinheri

Scanner scanner = new Scanner(new InputStreamReader(System.in));
{
	
	public void intelligentQuestion()
	{	
		currentMethod = 4;

		System.out.println();

		System.out.println("Answer the following IntelligentQuestion:");	

		System.out.println();	

		System.out.println("Computer Engineering was formally a branch under Electronic Engineering a)True or b)False");

		System.out.println("Pick an option(A,B,C,D)");
		String choice = scanner.nextLine();


		switch (choice) 
		{
			case "A":
			System.out.print("True");
			break;

			case "B":
			System.out.print("False");
			break;

			default:
				System.out.println("Wrong Option");
		tryagain();	
		}
	}
}