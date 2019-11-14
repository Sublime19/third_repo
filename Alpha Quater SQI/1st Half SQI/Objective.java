import java.io.*;
import java.util.*;



public class Objective
{	
	//String name = "";
	//String option = "";
	public static void main(String[] args) 
	{
		Scanner sca = new Scanner(new InputStreamReader(System.in));

		System.out.println("What is your name");
		String name = sca.nextLine();    //sca.nextLine for holding the inputed value

		System.out.println("Pick an option(A,B,C,D)");
		String option = sca.nextLine();

		switch (option) 
		{
			case "A":
			System.out.print("Wrong Answer");
			break;

			case "B":
			System.out.print("Right Answer");
			break;

			case "C":
			System.out.print("Wrong Answer");
			break;

			case "D":
			System.out.print("Wrong Answer");
			break;
		}




	}
}