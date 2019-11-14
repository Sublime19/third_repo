import java.io.*;
class CreatingaFile
{
	public static void main(String args[]) throws IOException
	{
		String userHomeDir = System.getProperty("usr.home", ".");
		String docDir = userHomeDir +"/Documents";
		String myDoc = docDir + "/My Documents";
		File myFolder = new File(myDoc);
		myFolder.mkDirs();
	}
}