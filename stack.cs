using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassExample
{

      
    class Program
    {
     
      

      public static void PushStack(){

         Console.WriteLine("Enter number to push");

         string number =Console.ReadLine();

         

         // StringBuilder sb = new StringBuilder();

          Menu();

      }
       public static void PopStack(){

        sb.Remove(sb.Length()-1);
          // int x=StackData.Length;
         
         // if( StackData[StackData.Length-1] == "remove"){

         //     StackData[StackData.Length-1]="remove";
         // }
          // while(x != "remove"){

          // }
          
        
      }
       public static void DisplayStack(){

          Console.WriteLine(sb.ToString());

         // for(int i=0;i<StackData.Length;i++){
         //    Console.WriteLine(i);
         // }

         // Menu();
        
      }
       public static void PushQueue(){
 
          Console.WriteLine("Enter number to push");

         string numbers =Console.ReadLine();

         string[] QueueData= new string[20];

         QueueData[QueueData.Length]=numbers;

         Menu();
        
      }
       public static void PopQueue(){


        
      }
      public static void DisplayQueue(){

         //  for(int n=0;n<QueueData.Length;n++){
         //    Console.WriteLine(n);
         // }

         // Menu();
        
      }

       public static void Stack(){
          
          Console.WriteLine("Select The Operation To Perform");
           Console.WriteLine("1.Push");
           Console.WriteLine("2.Pop");
           Console.WriteLine("3.Display");

            string X =Console.ReadLine();

            switch(X)
            {

               case "1": 
                   PushStack(); 
                   break;
               case "2":
                  PopStack(); 
                  break;
               case "3":
                  DisplayStack(); 
                  break;
               default :
                 Console.WriteLine("Incorrect Option");
                 break;
            };


       }

        public static void Queue(){
           
           Console.WriteLine("Select The Operation To Perform");
           Console.WriteLine("1.Push");
           Console.WriteLine("2.Pop");
           Console.WriteLine("3.Display");

           string Y =Console.ReadLine();

            switch(Y){

               case "1":
                  PushQueue(); 
                  break;
               case "2":
                  PopQueue(); 
                  break;
               case "3":
                  DisplayQueue(); 
                  break;
               default :
                 Console.WriteLine("Incorrect Option");
                 break;
            }

       }
       public static void Menu(){

          Console.WriteLine("Select The Structure To Perform");
           Console.WriteLine("1.Stack");
           Console.WriteLine("2.Queue");

           string Operation =Console.ReadLine();

           if(Operation == "1"){
               
                Stack();

            }
            else if(Operation == "2"){

                Queue();

            }
            else{
              
                Console.WriteLine("Incorrect Option");

            }

       }

       static void Main(string[] args)
        {
           
            Menu();

        }
    
    }

}