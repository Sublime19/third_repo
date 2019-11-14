import java.io.*;


public class Readworddoc
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream doc = new FileInputStream("‪Supernatural.txt");
		BufferedReader InputStream = new BufferedReader(doc); 

		String text = "";
		String line = reader.readLine();
		while(line != null)
		{
			//text = line;
			line = reader.readLine();
		}

		System.out.println(line);
	}

}