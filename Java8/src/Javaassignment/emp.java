package Javaassignment;
//3rd program
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class emp {
	
	public static void main(String[] args) {
	Collection <String> emp= Arrays.asList("sneha", "shruti", "sakshi", "neha", "neha", "mansi" );
	List<String> distinctElements = emp.stream()
	.distinct()
	.collect( Collectors.toList() );
	System.out.println( distinctElements );
	}
	}




