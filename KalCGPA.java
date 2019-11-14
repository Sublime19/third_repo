import java.util.Scanner;
public class KalCGPA{
   private static Scanner sca; 
  // private static float score; // initial balance to 0 for everyone
//  private static int anotherTransaction;
  public static void main(String args[]){
    sca = new Scanner(System.in);
    // call our transaction method here 
    grade();
  }
  private static void grade(){
        float score;
        int point;
        int unit; 
        System.out.println("Please enter score: "); 
       // System.out.println("Please enter unit: "); 
        score = sca.nextInt();
        //unit = sca.nextInt();
        if(score >= 70 || score == 100){
        System.out.println("You scored "+score+"\n\n");
        point = 5*2 ; 
        System.out.println("Your poin wt is "+point+" and your grade is A \n");
        }else if(score >= 60 || score == 69){
        System.out.println("You scored "+score+"\n\n");
        point = 4*2 ; 
        System.out.println("Your point is "+point+" and your grade is B \n"); 
        }else if(score >= 50 || score == 59){
        System.out.println("You scored "+score+"\n\n");
        point = 3*2 ; 
        System.out.println("Your point is "+point+" and your grade is C \n");
        }else if(score >= 45 || score == 49){
        System.out.println("You scored "+score+"\n\n");
        point = 2*2 ; 
        System.out.println("Your point is "+point+" and your grade is D \n");
        }else if(score >= 40 || score == 44){
        System.out.println("You scored "+score+"\n\n");
        point = 1*2 ;
        }else{
        System.out.println("You scored "+score+"\n\n");
        point = 0*2 ; 
        System.out.println("Your point is "+point+" and your grade is F \n");
        }
        //anotherTransaction();
  }
}
