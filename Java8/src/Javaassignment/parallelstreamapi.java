package Javaassignment;

import java.util.ArrayList;
import java.util.List;

public class parallelstreamapi {
	
	public static void main(String[] args) { List<Integer> nos = new ArrayList<Integer>();
	nos.add(932);
	nos.add(765);
	nos.add(755);
	nos.add(325);
	nos.add(788);
	nos.add(534);
	System.out.println("find any in parallel stream");
	nos.stream().parallel().filter(n -> n > 300).findAny().ifPresent(System.out::println); }
	}




