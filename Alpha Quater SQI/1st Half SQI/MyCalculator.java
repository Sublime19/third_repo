import java.oi.*;
import java.util.*;


public class Mycalcuator
{	
	static int result = 0;
	public static void main(String[] args)
	{
	 	Scanner scanner = new Scanner(new InputStreamReader(System.in));

	 	System.out.println("Enter first value");
	 	int fValue = Integer.parseInt(scanner.nextLine());

	 	System.out.println("Enter second value");
	 	int sValue = Integer.parseInt(scanner.nextLine());


	 	System.out.println("Enter operator(+,-,*,/)");

	 	String operator = scanner.nextLine();

	 	int result = (operator.equals("+"))? fValue + sValue : (operator.equals("-"))? fValve - sValue : (operator.equals("*"))? fValue * sValue : fValue / sValue;


	 	System.out.println("Your result is" +result); 


	 }
}
	

