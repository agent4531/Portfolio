package module4;

import java.util.Random;

public class Food {
	
	Random rand = new Random();
	
	synchronized public void Eat(Animal animal) {
		
		int meal = rand.nextInt(animal.maxRest);
		
		System.out.print(animal.name + " started eating ");
		try {
			Thread.sleep(meal);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("| eating has stoped");
	}
}
