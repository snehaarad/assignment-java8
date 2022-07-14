package Javaassignment;
//7th program
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class even {
	
	

	    public static void main(String[] args) {
	        List<Integer> l1= Arrays.asList(22,47,93,78,100,99);
	        List<Integer> evenNumbers= l1.stream().filter(a-> a%2==0).collect(Collectors.toList());


	            System.out.println(evenNumbers);
	    }
	}


