using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace group7_project
{
    class Program
    {
        static void Main(string[] args)
        {
            stack st = new stack();
            while (true)
            {
               // Console.Clear();
                Console.WriteLine("A PROGRAM TO IMPLEMENT STACK AND QUEUE USING SWITCH SELECTION STATEMENT");
                Console.WriteLine("1. please add a number");
                Console.WriteLine("2. Remove number at the top");
                Console.WriteLine("3. Display all numbers available in the stack");
                Console.WriteLine("4. Exit");
                Console.Write("please select from the options above ");
                int options = Convert.ToInt32(Console.ReadLine());
                switch (options)
                {
                    case 1:
                        Console.WriteLine("please,enter a number : ");
                        st.Push(Console.ReadLine());
                        break;

                    case 2: Console.WriteLine("Number removed : {0}", st.Pop());
                        break;

                    case 3: st.Display();
                        break;

                    case 4: System.Environment.Exit(1);
                        break;
                }
                Console.ReadKey();
            }
        }
    }

     //interface allows only declaration NO implementation(implementation is done by the class)
    interface StackADT
    {

        //return type of the method name of the method 
        Boolean isEmpty();
        void Push(Object element);
        Object Pop();
        void Display();
    }
    //stack class inherits(:) the interface StackADT 
    class stack : StackADT
    {
       //private int StackSize;
        public int StackSizeSet
        {
            get { return StackSize; }
            set { StackSize = value; }
        }
        public int top;
        Object[] item;
        public stack()
        {
            StackSizeSet = 10;
            item = new Object[StackSizeSet];
            top = -1;
        }
        public stack(int capacity)
        {
            StackSizeSet = capacity;
            item = new Object[StackSizeSet];
            top = -1;
        }
        public bool isEmpty()
        {
            if (top == -1) return true;

             
        }

        public void Push(object element)
        {
            if (top == (StackSize - 1))
            {
                Console.WriteLine("Stack is full!");
            }

            else
            {

                item[++top] = element;
                Console.WriteLine("number has been pushed successfully!");
            }
        }
        public object Pop()
        {
            if (isEmpty())
            {
                Console.WriteLine("Stack is empty!");
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
