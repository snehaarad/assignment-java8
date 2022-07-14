package Javaassignment;

import java.util.ArrayList;
import java.util.List;

public class maxlengthofstring {


	public static void main(String[] args) {


		String[] str = {"sneha", "swati", "mansi", "sakshi", "renuka","neha"};

		List<Integer> stringcount= new ArrayList<Integer>();

		for(String s:str) {
			int count=0;
			char[]arr=s.toCharArray();
			for(char ch:arr) {
				count++;

			}
			stringcount.add(count);


		}

		Integer max=stringcount.stream().max((s1,s2)->s1.intValue()>s2.intValue()?1:-1).get();
		System.out.println("Maximum length of given string :"+max);
	}
}

