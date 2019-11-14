import java.io.*;
import java.util.*;


public class Theory 
{
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(new InputStreamReader(System.in));

		System.out.println("Enter Matric No");
		int Matric = Integer.parseInt(sca.nextLine());		//Integer.parseInt(sca.nextLine()); - syntax used to force{parse} an int to string


		


		System.out.println("Enter"+" "+"Department"+" "+"Faculty"); 
		String Dep = sca.nextLine();

		System.out.println("Enter"+" "+"Course"+" "+"code");
		String Cou = sca.nextLine();

		System.out.println();

		System.out.println("Answer the following Questions");	

		System.out.println();	

		System.out.println("LAUTECH was established in the Year ...");

		System.out.println("Pick an option(A,B,C,D)");
		String option = sca.nextLine();


		switch (option) 
		{
			case "A":
			System.out.print("Right Answer");
			break;

			case "B":
			System.out.print("Wrong Answer");
			break;

			case "C":
			System.out.print("Wrong Answer");
			break;

			case "D":
			System.out.print("Wrong Answer");
		}
	}
}