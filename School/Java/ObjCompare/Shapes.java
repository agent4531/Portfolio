package module_1;

import java.util.Random;

abstract public class Shapes {
	
	Random rand = new Random();

	public int returnValue() {
		int num = rand.nextInt(30000);
				
		return num;
		
	}
}
