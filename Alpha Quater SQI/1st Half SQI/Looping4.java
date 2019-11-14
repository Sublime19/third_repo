public class Looping4

{
	
	public static void main(String[] args)
	{
		int a,b ;
		a=(int)(Math.random()*10+1);
		System.out.println("a= "+a);
		
		b=(int)(Math.random()*10+1);
		while (a==b)		
		{
			
			System.out.println("b= "+b);
		}
		System.out.println("a= "+a+"and"+"b= "+b);	
			
				
	}

}	