using System;
using System.Colletions.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;


namespace ForLoop
{
	class Program
	{
		static void Main(String[]args)
		{

	int[]Age = new int [5];

	Age[0] = 14;
	Age[0] = 16;
	Age[0] = 19;
	Age[0] = 45;
	Age[0] = 86;

	// gentrate the value of an array using while loop
	int i = 0;
	while (i< Age.Length)
			{
				Console.WriteLine(Age[i]);
				i++;
			}

 // gentrate even number by incrementing i by 2 i.e i = i+2 
	for (int i = 0; i < 20 ; i= i+2)
		}
	}
}
