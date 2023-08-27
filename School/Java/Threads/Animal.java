package module4;
import java.util.*;

public class Animal implements Runnable{

		static Food food = new Food();
	
	String name;				// Hare | Tortoise
	int position = 0;			//starts at zero and and goes to 120
	int speed;					//how much distance is covered
	int maxRest;				//max rest time - used for rand num generator for real rest time
	static Boolean winner= false;		//ends processes once a winner is determine - static so it is the same among all objects of this class

	public Animal (String N,int S,int mR, Food food) {
		name = N;				// Hare | Tortoise			
		speed = S;					
		maxRest = mR;
	}
	
	public void run() {
		System.out.println(this.toString());
		while(!(winner)) {
			Move();
		}
		
	}
	public static void main(String[] args) {
		
		Thread H1 = new Thread(new Animal("Hare",9,220,food));
		Thread T1 = new Thread(new Animal("Tortoise",5,165,food));
		H1.start();
		T1.start();
		try {
			H1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			T1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		Animal.winner = false;
		Thread H2 = new Thread(new Animal("Hare",7,220));
		Thread T2 = new Thread(new Animal("Tortoise",5,165));
		H2.start();
		T2.start();
		try {
			H2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			T2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Animal.winner = false;
		Thread H3 = new Thread(new Animal("Hare",7,220));
		Thread T3 = new Thread(new Animal("Tortoise",5,165));
		H3.start();
		T3.start();
		try {
			H3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			T3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Animal.winner = false;
		Thread H4 = new Thread(new Animal("Hare",7,220));
		Thread T4 = new Thread(new Animal("Tortoise",5,165));
		H4.start();
		T4.start();
		try {
			H4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			T4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Animal.winner = false;
		Thread H5 = new Thread(new Animal("Hare",7,220));
		Thread T5 = new Thread(new Animal("Tortoise",5,165));
		H5.start();
		T5.start();
		try {
			H5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			T5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
	}
	
	public String toString() {
		String results;
		
		results = "I am a: " + name + " and I go " + speed + " f/m, after that I may \n\tneed a rest of: " + maxRest + " ms or sooner to run again";
		
		return results;
	}
	
	public void Move() {//moves animal ahead
		position += speed;
		System.out.println(name + " moves to " + position);
		
		if (position >= 120) {
			winner = true;
			System.out.println(name + " Wins!!!");
		}
		
		food.Eat(this);
		
	}
	
	
}
