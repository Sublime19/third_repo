import java.io.*;
import java.util.*;


public class Mycalculator
{	
	public void multiply() {
	 	Scanner scanner = new Scanner(new InputStreamReader(System.in));
	 	System.out.print("Enter first value: ");
	 	int fValue = Integer.parseInt(scanner.nextLine());

	 	System.out.print("Enter second value: ");
	 	int sValue = Integer.parseInt(scanner.nextLine());

	 	System.out.print("Enter operator(+,-,*,/)");

	 	String operator = scanner.nextLine();

	 	int result = (operator.equals("+"))? fValue + sValue : (operator.equals("-"))? fValue - sValue : (operator.equals("*"))? fValue * sValue : fValue / sValue;

	 	System.out.println("\nanswer = " +result); 
	 }
}
	

