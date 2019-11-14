public class Assignment 
{
	public static void main(String [] args)
	{ 
		 int a=3;
		 int b=10;
		 int c=5;
		 
		 String s;
		 String p;
		 String d;
		 String k = "Hello Java Class";
		 int x= k.length();

   		s=(a==b)? "Present":"Absent"; 
		System.out.println(s);
		
		p=(a<c)? "True":"False";
		System.out.println(p);

		d=(a>b || c<a)? "True":"False";
		System.out.println(d);

	
		System.out.println(k);
		System.out.println(x);
	
		System.out.println(k.toUpperCase());
		
		System.out.println(k.toLowerCase());
		
		int r= k.indexOf("Java");
		System.out.println(r);
		
			
                String me ="John";
		System.out.println(me+"Welcome"+k);
		System.out.println(me+" "+"Welcome"+" "+k);
	}

}
