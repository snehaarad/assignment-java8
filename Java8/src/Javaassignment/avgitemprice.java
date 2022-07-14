package Javaassignment;
//6th program

import java.util.ArrayList;

public class avgitemprice {
	//Question no 6public class AvgLess {
	public static void main(String[] args) {
	ArrayList<item> I=new ArrayList<item>();
	I.add(new item(1,"mouse",50000));
	I.add(new item(2,"keyboard",70000));
	I.add(new item(3,"bag",25000)); double av = (double) I.stream().mapToDouble(obj -> obj.itemprice).average().getAsDouble();
	System.out.println("The highest Item price is :"+av);
	System.out.println("The Price Less than avg is");
	I.stream().filter(p ->p.itemprice< av)
	.map(pm ->pm.itemprice) // fetching price
	.forEach(System.out::println); // iterating price
	}
	}




