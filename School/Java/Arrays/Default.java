package module5;

import java.lang.reflect.Array;
import java.util.*;

public class Default {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>(Arrays.asList("John","McKenly","Eric","Tia","Evan","Levi","Tyler","Zook"));
		System.out.println(nameList);
		Collections.sort(nameList);
		System.out.println(nameList);
		Collections.shuffle(nameList);
		System.out.println(nameList);
		System.out.println(nameList.indexOf("Evan"));
		System.out.println(nameList.indexOf("Will"));
		nameList.toArray();
		System.out.println(nameList);
		List<ArrayList<String>> nameList2 = Arrays.asList(nameList);
		System.out.println(nameList2);
		
		
	}
	
}
