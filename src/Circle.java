//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class Circle extends Point {
  protected double radius;
  
  public Circle() {
	  super();
	  radius =1;
  }
  
  public Circle(double xValue, double yValue, double radValue) {
	  super(xValue,yValue);
	  radius = radValue;
  }
  
 public void setCircle(double xValue, double yValue, double radValue) {
	 setPoint(xValue, yValue);
	 setRadius(radValue);
 }
  
  public void setRadius(double radValue){
	  radius = radValue;
  }
  
  public double getRadius() {
	  return radius;
  }
  
  public double getArea() {
	return(Math.PI * radius *radius);
  }
  
  public double getCircumference() {
	  return(Math.PI * radius * 2);
  }
  
  public String toString() {
	  return "( " + super.toString()  +" radius: " +  String.format("%.2f", radius) + " )";
  }
  
  public boolean equals(Circle otherCircle) {
	 return( super.equals(otherCircle) && radius == otherCircle.radius) ;
  }
  
  public void makeCopy(Circle otherCircle) {
	  super.makeCopy(otherCircle);
	  radius = otherCircle.radius;
  }
  
  public Circle getCopy() {
	  Circle temp = new Circle();
	  super.getCopy();
	  temp.radius = radius;
	  return temp;
  }
  
  public void printCircle() {
	  System.out.print(toString());
  }
  
 
  
}