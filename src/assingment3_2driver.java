//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Drives Point and Circle
public class assingment3_2driver{
//Test
	public static void main(String[]args) {
	
	Circle circle1 = new Circle();	
	Circle circle2 = new Circle(1,1,3);
	System.out.print("circle1: ");
	circle1.printCircle();
	System.out.println();
	System.out.print("circle2: ");
	circle2.printCircle();
	System.out.println();
	circle1.setRadius(10);
	Circle circle3 = new Circle();
	circle3 = circle1.getCopy();
	System.out.print("circle1: ");
	circle1.printCircle();
	System.out.println();
	System.out.print("circle3: ");
	circle3.printCircle();
	System.out.println();
	if(circle1.equals(circle3))
		System.out.println("circle1 equals circle3");
	else
		System.out.println("circle1 doesn't equal circle3");
	circle3.setPoint(-9, -9);
	System.out.print("circle3: ");
	circle3.printCircle();
	System.out.println();
	if(circle1.equals(circle3))
		System.out.println("circle1 equals circle3");
	else
		System.out.println("circle1 doesn't equal circle3");
	System.out.println("circle1's area is: " + circle1.getArea() + " and it's circumfrence is: " + circle1.getCircumference());
	System.out.println("circle2's area is: " + circle2.getArea() + " and it's circumfrence is: " + circle2.getCircumference());
	System.out.println("circle3's area is: " + circle3.getArea() + " and it's circumfrence is: " + circle3.getCircumference());
	}
  }