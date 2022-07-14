package Javaassignment;

public class pythagoras {
	
	public static void main(String[] args)
	{
	int array[] = {3, 4, 6, 12, 13, 5, 9, 1, 8, 15, 289};
	int count = 0;

	for(int i = 0 ; i <= array.length - 3 ; i++)
	{
	int a = array[i] * array[i];
	int b = array[i + 1] * array[i + 1];
	int c = array[i + 2] * array[i + 2];

	if(a == b + c || b == a + c || c == a + b)
	{
	count++;
	}
	}System.out.println("Combination of "+count+" numbers satisfy pythagoras template");
	}
		
}

