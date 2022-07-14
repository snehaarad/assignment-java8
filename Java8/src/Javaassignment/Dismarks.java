package Javaassignment;
//2nd question
public class Dismarks {
	
	static void printDis(int arr[], int n)
	{

	for (int i = 0; i < n; i++)
	{
	int j;
	for (j = 0; j < i; j++)
	if (arr[i] == arr[j])
	break;
	if (i == j)
	System.out.print( arr[i] + " ");
	}
	}
	public static void main (String[] args)
	{
	int arr[] = {9, 5, 7, 10, 5, 90, 9, 7, 90};
	int n = arr.length;
	printDis(arr, n);
	}
	}




