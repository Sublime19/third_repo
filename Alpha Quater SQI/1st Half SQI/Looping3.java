import java.io.*;
import java.lang.*;

public class Looping3

{
	
	public static void main(String[] args)
	{
		int a,b ;
			a=(int)(Math.random()*10+1);
				System.out.println("a= "+a);

			do			
			{
			b=(int)(Math.random()*10+1);
				System.out.println("b= "+b);
			}	
			while(a==b);
				System.out.println("a= "+a+"and"+"b= "+b);
	
	}//"Enter"+" "+"Department"+" "+"Faculty"
}