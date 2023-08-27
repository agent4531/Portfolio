package module_1;

public class module1 {

	public static void main(String[] args) {
		Rectangle obj1 = new Rectangle(4.0,5.0);
		Rectangle obj2 = new Rectangle(5.7,8.1);
		Circle obj3 = new Circle(4.2);
		Circle obj4 = new Circle(3.0);
		
		System.out.println("rectangle ones length is: " + obj1.getLength() + " and its width is: " + obj1.getWidth() + " which gives you an area of: " + obj1.computeArea());
		
		System.out.println("rectangle twos length is: " + obj2.getLength() + " and its width is: " + obj2.getWidth() + " which gives you an area of: " + obj2.computeArea());
		
		System.out.println("circle ones radius is: " + obj3.getRadius() + " which gives you an area of: " + obj3.computeArea());
		
		System.out.println("circle twos radius is: " + obj4.getRadius() + " which gives you an area of: " + obj4.computeArea());
	}

}
