package Javaassignment;

import java.util.Arrays;
import java.util.List;

public class question4 {

	public static void main(String[] args) {
	List<Integer> intList = Arrays.asList(2,5,2,7,6,8);
	int av = (int) intList.stream().mapToInt(val -> val).max().getAsInt();
	System.out.println("Maximum number found to be:"+av);
	}
	}




