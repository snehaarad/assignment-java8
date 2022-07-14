package Javaassignment;

import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

//8th program
public class evenornot
{ 
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number:");
	int n=sc.nextInt();

	if(n % 2==0)
	{
		System.out.println("Given Number is Even Number");
	}
	else
	{
		System.out.println("Given Number is Odd Number");
	} 
}
    public static void condition(List<Integer> list, Predicate<Integer> predicate)
	{
		for(Integer n:list) {
			if(predicate.test(n)) {
				System.out.println(n +" ");
        }
	   }
	}

}
