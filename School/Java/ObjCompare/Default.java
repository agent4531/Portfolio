package module6;

import java.util.*;

import module_1.Shapes;

public class Default {

	public static <T> int findInList(List<T> TList, T Tvar) {
		int location=0;
		
		location = TList.indexOf(Tvar);
		
		return location;
	}
	
	public static <T extends Shapes> T greaterThan(T obj1,T obj2) {
		int obj1val = obj1.returnValue();
		System.out.println(obj1 + " int\t" + obj1val);
		int obj2val = obj2.returnValue();
		System.out.println(obj2 + " int\t" + obj2val);
		
		if (obj1val > obj2val ) {
			
			return obj1;
		}else{
			return obj2;
		}
		
	}
}
