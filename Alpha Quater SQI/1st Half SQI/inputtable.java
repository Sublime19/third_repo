import java.util.Scanner;
public class inputtable{
	public static void main(String[]args){
		System.out.println("How many multiples table?");
		System.out.println("Enter 1 for a single table");
		System.out.println("Enter 2 for multiple tables");
		Scanner inn = new Scanner(System.in);
		int p = inn.nextInt();
		
		switch (p)
		{
			case 1: 
			System.out.println("Enter the number");
			System.out.println("Enter the table no");
		
		int x = inn.nextInt();
		for (int i = x; i <= x; i++)
  				{
 			System.out.print( " | ");
 			for (int j = 1; j <= 9; j++) 
 					{
 				// Display the product and align properly
 				System.out.printf("%4d", i * j);
 					}
 			System.out.println();
				}
		break;

		case 2:
		System.out.println("How many multiples do you need?");
		Scanner mult = new Scanner(System.in);
		int y = mult.nextInt();
		if (y==2) {
			System.out.println("Enter first number");
			int f = mult.nextInt();
			System.out.println("Enter second number");
			int s = mult.nextInt();
			//System.out.println('f'+'s');
					
		for (int l= f; l <= f; l++)
  		{
 			System.out.print( " | ");
 			for (int j = 1; j <= 9; j++) 
 			{
 				// Display the product and align properly
 				System.out.printf("%4d", l*j);
 			}
 			System.out.println();
		}
		for (int r= s; r <= s; r++)
  		{
 			System.out.print( " | ");
 			for (int j = 1; j <= 9; j++) 
 			{
 				// Display the product and align properly
 				System.out.printf("%4d", r* j);
 			}
 			System.out.println();
		}
		/*
		//Scanner mult = new Scanner(System.in);
		//String Cou = sca.nextLine();
		int mult = Integer.parseInt(Scanner.nextLine());
		//int Matric = Integer.parseInt(sca.nextLine());
		
		
		
		
		}
		}
		
		
		

		//for (int j = 1; j <= 9; j++)
 		//System.out.println("   " + j);
		//System.out.println(x);
		
	 	//System.out.println("\n");
	*/
}
}
}
}