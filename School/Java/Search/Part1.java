package module6;

import java.util.*;

public class Part1 {

	public static final String find ="\u001B[31m";
	public static final String normal ="\u001B[30m";
	
	public static void main(String[] args) {
		
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(2,1,0,13,7,9,10,4));
		Integer int1 = 10;
		int var1 = Default.findInList(list1, int1);
	
		System.out.println("We are looking for: " + find + int1 + normal + " in this list: " + list1 + " \n\twhich is at position: " + var1);
	
		List<Double> list2 = new ArrayList<>(Arrays.asList(6.2,1.0,0.9,13.225,7.4,9.8,10.1,4.33333,9.4,3.33,0.1,3.7));
		Double int2 = 6.2;
		int var2 = Default.findInList(list2, int2);
		
		System.out.println("We are looking for: " + find + int2 + normal + " in this list: " + list2 + " \n\twhich is at position: " + var2);
	
		List<String> list3 = new ArrayList<>(Arrays.asList("Eric","Tia","Evan","Levi","Tyler","Zook"));
		String int3 = "Evan";
		int var3 = Default.findInList(list3, int3);
		
		System.out.println("We are looking for: " + find + int3 + normal + " in this list: " + list3 + " \n\twhich is at position: " + var3);
		
		module_1.Circle obj1 = new module_1.Circle (2);
		module_1.Rectangle obj2 = new module_1.Rectangle (3,3);
		
		module_1.Shapes greater;
		greater = Default.greaterThan(obj1, obj2);
		System.out.println("The bigger int was from: " + greater);
		
	}
}
