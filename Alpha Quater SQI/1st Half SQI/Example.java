public class Example
  {
	int f =5;
	int v =6;
     public static void main(String agrs[])
	{
	  int f;
	  int v;
	  int s;
	  
	     f=5;
	     v=6;
		
	 f+=5;
	System.out.println(f);

	 v*=f;
	System.out.println(v);

	 f--;
	 f-=1;
	System.out.println(f); 
	
	 s=(60>v)? ++v:--f;
	System.out.println(s);

	}
   }