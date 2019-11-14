using System.Linq;
using System.Text;
using System.Collections;
using System.Threading.Tasks;

namespace group7_project2
{
    class Program
    {
        static void Main(string[] args)
        {
            Queue Que = new Queue();
            while (true)
            {
               // Console.Clear();
                Console.WriteLine("A PROGRAM TO IMPLEMENT STACK AND QUEUE USING SWITCH SELECTION STATEMENT");
                Console.WriteLine("1. Please add a number");
                Console.WriteLine("2. Remove number at the top");
                Console.WriteLine("3. Display all numbers available in the queue");
                Console.WriteLine("4. Exit");
                Console.Write("please select from the options above ");

                int options = Convert.ToInt32(Console.ReadLine());
                switch (options)
                {
                    case 1:
                        Console.WriteLine("Please,enter a number : ");
                        Que.Enqueue(Console.ReadLine());
                        break;

                    case 2: Console.WriteLine("Number removed : {0}", Que.Dequeue());
                        break;

                    case 3: Que.Peek();
                        break;

                    case 4: System.Environment.Exit(1);
                        break;
                }
                Console.ReadKey();
            }
        }
    }

     //interface allows only declaration NO implementation(implementation is done by the class)
    interface Iqueue
    {

        //return type of the method name of the method 
        Boolean isEmpty();
        void Enqueue(Object element);
        Object Dequeue();
        void Peek();
    }
    //stack class inherits(:) the interface StackADT 
    class Queue : Iqueue
    {
       //private int StackSize;
        public int StackSizeSet
        {
            get { return QueueSize; }
            set { QueueSize = value; }
        }
        public int top;
        Object[] item;
        public Queue()
        {
            QueueSizeSet = 10;
            item = new Object[QueueSizeSet];
            top = -1;
        }
        public stack(int capacity)
        {
            QueueSizeSet = capacity;
            item = new Object[QueueSizeSet];
            top = -1;
        }
        public bool isEmpty()
        {
            if (top == -1) return true;

             
        }

        public void Push(object element)
        {
            if (top == (QueueSize - 1))
            {
                Console.WriteLine("Queue is full!");
            }

            else
            {

                item[++top] = element;
                Console.WriteLine("number has been added successfully!");
            }
        }
        public object Dequeue()
        {
            if (isEmpty())
            {
                Console.WriteLine("Queue is empty!");
                return "No elements";
            }
            else
            {

                return item[top--];
            }
        }

        public void Display()
        {
            for (int i = top; i > 0; i--)
            {

                Console.WriteLine("Item {0}: {1}", (i + 1), item[i]);
            }

        }
    }
}
