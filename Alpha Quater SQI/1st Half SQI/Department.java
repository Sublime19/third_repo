public class Department 
{
	int instructors = 5 ;
	int students = 20;
	String result = "";
	String diploma = "Enterprise";
	public void graduation(String r)
	{
		this.result=r;
	}
	public static void main(String args[])
	{
		Department web = new Department();
		Department android =new Department();
		System.out.println(web.diploma); 
		System.out.println(android.diploma);
		web.graduation("Excellence");
		System.out.println(web.result);
		System.out.println(android.result);
	}

}







import java.io.*;
import java.util.*;

public class Calculator 
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

		String ope = scanner.nextLine();

		int result = (ope.equals("*"))? fValue*sValue : (ope.equals("/"))? fValue / sValue: (ope.equals("+"))? fValue + sValue: fValue - sValue;
		
		




		

		System.out.println("Your result is " +result);