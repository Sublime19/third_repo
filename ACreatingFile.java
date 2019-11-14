import java.io.*;
import java.util.*;

class ACreatingFile
{
	public static void main(String args[]) throws IOException
	{	
		
		String userHomeDir = System.getProperty("user.home", ".");
		String docDir = userHomeDir +"/Documents";
		String myDoc = docDir + "\\LAUTECH\\Faculty\\Departments";
		File myFolder = new File(myDoc);
		if(!myFolder.exists()){
			myFolder.mkdirs();
		}
		File file = new File(myFolder.getAbsolutePath()+"\\CSE LIST2.csv");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		System.out.println("S/N\tFull Name\t\tMatric Number");
		while((line = br.readLine()) != null){
			String[] values = line.split(",");
			System.out.println(values[0]+"\t"+values[1]+"\t"+values[2]);

		}
	}
}