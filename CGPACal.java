import java.util.*;
	public class CGPACal{
		public static void main(String[] args) {
	/* private static void mainMenu() {
        
        System.out.println("2. Gender");
        System.out.println("3. Grade");
        System.out.println("4. ");
        System.out.println("Enter the corresponing number");
        int option = sca.nextInt();
        switch(option){
            case 1: deposit();
            break;
            case 2: withdrawal();
            break;
            case 3: checkbalance();
            break;
            case 4: buyairtime();
            break;
            default:
                System.out.println("Invalid selection!");
                auth();
        }*/
    System.out.println("Enter Score?\n");
	Scanner sca = new Scanner(System.in);
  	int score = sca.nextInt();
  	switch(score)
  	{
  	case 1:
  	//int score = sca.nextInt();
    if(score >= 70 || score == 100){
    System.out.println("Grade is A!\n");
    }else{
    System.out.println(" ");
	}
    break;

    case 2:
  	//int score = sca.nextInt();
    if(score >= 60 || score == 69){
    System.out.println("Grade is B!\n");
    }else{
    System.out.println(" ");
	}
    break;

    case 3:
  	//int score = sca.nextInt();
    if(score >= 50 || score == 59){
    System.out.println("Grade is C!\n"); 
	}else{
    System.out.println(" ");
	}
    break;

    case 4:
  	//int score = sca.nextInt();
    if(score >= 45 || score == 49){
    System.out.println("Grade is D!\n");
    }else{
    System.out.println("");
	} 
    break;

    case 5:
  	//int score = sca.nextInt();
    if(score >= 40 || score == 44){
    System.out.println("Grade is E!\n"); 
	}else{
     System.out.println("Grade is F!\n");	}
    break;

    //default:
  	//int score = sca.nextInt();
   //if(score >=  || score == 0){
   	//{
   
    //} 
    //break;
	}
	}
}