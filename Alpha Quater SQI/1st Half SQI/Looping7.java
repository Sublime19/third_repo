public class Looping7
{
	public static int addition(int x, int y)
	{
		System.out.println(x + y);
		return x + y;
	}
	
	public static void multiplicationTable()
	{
		for(int b = 1 ; b <= 12; b++)

			System.out.println("\n");

			for(int a = 1; a <= 12; a++)
			{
				System.out.print("\n");

				for(int b = 1; b <=12 ; b++)
				{
					System.out.printf("%4d" , a*b);
				}
			
			}
		System.out.print("\n");
		System.out.print("this is the addition that follows ");
		addition(10, 30);
	}
	public static void main(String[] args)
	{
		Looping7 lp = new Looping7();
		lp.multiplicationTable();
	}

}
