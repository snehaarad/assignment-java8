package Javaassignment;
//9th program

public class evenodd {
	


		public static void main(String[] args) {
		int array[] = { 23, 55, 54, 9, 76, 66, 2, 91 ,9,66,12};
		int n = array.length;

		int evenSize = 0;
		int oddSize = 0;
		for (int i = 0; i < n; i++) {
		if (array[i] % 2 == 0)
		evenSize++;
		else
			oddSize++;
			}
			System.out.print("Even numbers  : "+evenSize+"\n");
			System.out.print("Odd numbers: "+oddSize);
			}}
			



