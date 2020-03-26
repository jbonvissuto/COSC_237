//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
//Drives Clock and ExtClock
public class assingment3_1driver{
  public static void main(String arg[]){
   ExtClock clock1 = new ExtClock(6,1,0,"KST");
   clock1.printTime();
   System.out.println();
   ExtClock clock2 = new ExtClock();
   clock2.printTime();
   System.out.println();
   if(clock2.equals(clock1))
	   System.out.println("The clocks are equal.");
   else
	   System.out.println("The clocks are not equal.");
   
  }
}