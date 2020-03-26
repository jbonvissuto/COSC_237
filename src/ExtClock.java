//COSC 237-101
//Name: Jackson K. Bonvissuto
//ID: 0716190
public class ExtClock extends Clock {
  private String zone;
  
  //Default constructor
  public ExtClock(){
    super();
    zone = "EST";
  }
   //Constructor with parameters 
  public ExtClock(int hours, int minutes, int seconds, String timeZone){
    super(hours, minutes, seconds);
    zone = timeZone;
  }
  
  public void setTimeZone(String timeZone){
    zone = timeZone;
  }
  
  public String getTimeZone(){
  return zone;
  }
  
  public void printTime(){
   super.printTime();
   System.out.print(":" + getTimeZone());
  }
  
  public boolean equals(ExtClock otherClock)
  {
    return (super.equals(otherClock) && zone == otherClock.zone);
  }
  
  
  
}




