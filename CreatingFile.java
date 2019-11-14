/* Display a text file.
To use this program, specify the name
of the file that you want to see.
For example, to see a file called TEST.TXT,
use the following command line.
java ShowFile TEST.TXT
*/
import java.io.*;
class CreatingFile
{
	public static void main(String args[]) throws IOException
	{
		String userHomeDir = System.getProperty("user.home", ".");
		String docDir = userHomeDir +"/Documents";
		String myDoc = docDir + "/My Documents";
		File myFolder = new File(myDoc);
		if (!myFolder.exists()){
			myFolder.mkdirs();

		}
		File list= new File(myFolder.getAbsolutePath()+"/list.txt");
		BufferedReader br = new BufferedReader(new FileReader(list));
		String line;
		while((line = br.readLine())!= null){
			System.out.println(line);
		}
		

	}
  }