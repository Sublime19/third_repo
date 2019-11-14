import java.util.Random;

import java.util.Scanner;

class GuessNumber 
{

    static Random rand = new Random(); 
    static Scanner scan = new Scanner(System.in); 
    static int number; 

    public static void main(String[] args) 
    {
        playGame();
    }

    public static void playGame() 
    {
        number = rand.nextInt(100) + 1;
        System.out.println("Guess the number between 1 and 100");
        while (true) 
        {
            int guess = scan.nextInt();
            if (guess < number) 
            {
                System.out.println("Higher!");
            } 
                else if (guess > number) 
            {
                System.out.println("Lower!");
            }   

                else if (guess == number) 
            {
                System.out.println("Correct!");
                Scanner scan2 = new Scanner(System.in);
                System.out.println("do you wanna play again?[Y/N]");
                String val = scan2.next();
                if (val.equalsIgnoreCase("Y")) 
                {
                    playGame();
                } 
                    else 
                {
                    break;
                }

            }    
        }
    }
}
