package Javaassignment;
//avg marks
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Avgmarks {
	
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num1=0;
	int num2=0;
	int num3=0;
	int num4=0;
	int num5=0;
	while(num1 == 0) {
	System.out.print("Input Maths number: ");
	int tempnum1 = in.nextInt();
	if(tempnum1 > 101) {
	System.out.println("please correct number");
	}
	else {
	num1= tempnum1;
	}
	}
	while(num2 == 0) {
	System.out.print("Input English number: ");
	int tempnum2 = in.nextInt();
	if(tempnum2 > 101) {
	System.out.println("please correct number");
	}
	else {
	num2= tempnum2;
	}
	}
	while(num3 == 0) {
	System.out.print("Input Marath number: ");
	int tempnum3 = in.nextInt();
	if(tempnum3 > 101) {
	System.out.println("please correct number");
	}
	else {
	num3= tempnum3;
	}
	}
	while(num4 == 0) {
	System.out.print("Input science number: ");
	int tempnum4 = in.nextInt();
	if(tempnum4 > 101) {
	System.out.println("please correct number");
	}
	else {
	num4= tempnum4;
	}
	}
	while(num5 == 0) {
	System.out.print("Enter History number: ");
	int tempnum5 = in.nextInt();
	if(tempnum5 > 101) {
	System.out.println("please correct number");
	}
	else {
	num5= tempnum5;
	}
	}
	System.out.println("Average of five numbers is: " +
	(num1 + num2 + num3 + num4 + num5) / 5);
	// By using lambda and stream API
	List<Integer> mrks = Arrays.asList(num1 , num2 , num3 , num4 , num5);
	Double y= mrks.stream().mapToInt(val -> val).average().getAsDouble();
	System.out.println("Average of all marks numbers : " + y); }
	}




