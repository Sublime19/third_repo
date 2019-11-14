

import java.util.*;

public class ATMapp {

    private static void mainMenu() {
        System.out.println("1. Deposit");
        System.out.println("2. Withraw");
        System.out.println("3. Balance");
        System.out.println("4. Airtime");
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
            
        }
    }
    
         double Bal= 10515; 
         
        static Scanner sca = new Scanner(System.in);
         
          
         
      public static void deposit(){
        
        System.out.println("Enter Amount to Deposit");
        double amount = sca.nextDouble();

      }
      public static void withdrawal(){
        System.out.println("1. #500");
        System.out.println("2. #1000");
        System.out.println("3. #5000");
        System.out.println("4. #10000");
        System.out.println("Enter Amount to withdraw");
        int amount  = sca.nextInt();
        switch(amount){
            case 1:
            System.out.print("#500");
            break;
            case 2: 
            System.out.print("#1000");
            break;
            case 3:
            System.out.print("#5000");
            break;
            case 4:
            System.out.print("#10000");
            break;
            default:
            System.out.print("Invalid selection!");
            //auth();   
        }
    }
    public static void checkbalance()
            {
                System.out.println("Acc Balance:\n\n"); 
                System.out.println("#10,515K"); 
                //mainMenu();
            }
      
             public static void buyairtime()
             {
                int choice; 
                System.out.println("Please select an option"); 
                System.out.println("1. 100");
                System.out.println("2. 200");
                System.out.println("3. 500");
                System.out.println("4. 1000");
                choice = sca.nextInt();  
             }  
             public static void transfer()
             { 
                System.out.println("Enter Account number");
                int number = sca.nextInt();
                System.out.println("Enter Amount to transfer");
                int amount = sca.nextInt();
                System.out.println("Are you sure you want to transfer funds to"+ number);
                int funds = sca.nextInt();
                switch (funds){
                    case 1: System.out.println("1.YES");
                    break;
                    case 2: System.out.println("2.NO");
                    break;
                    default:System.out.print("Invalid selection!");
                    //mainMenu();  
                }
             }  
      
             public static void auth()
             {
                System.out.println("Enter your 4 digit pin");
                String pin = sca.nextLine();
                if (pin.equals("1244"))
                {
                    mainMenu();

                }
                 
             }

    /**
     * @param args the command line arguments
     */ 
    
    public static void main(String[] args) {
       auth();    
                
              
    }
}