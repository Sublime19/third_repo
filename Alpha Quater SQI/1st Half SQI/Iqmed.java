public class Iqmed{
   private char Answer(char a, char b, char c, char d);
   public void setAnswer(char option)
   {
   		Answer = option;
   }
   public char getAnswer()
   {
   		return Answer;
   }
   public void displayAnswer()
   	{
   		System.out.printf("Answer: %s\n", getAnswer);
   	}
}
