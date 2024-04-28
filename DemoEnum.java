package we11;
enum Signal
{
	RED,YELLOW,GREEN
}
class checkSignal
{
	Signal currentSignal;
	public checkSignal(Signal cs)
	{
		this.currentSignal=cs;
	}
	public void makeRide()
	{
		switch(currentSignal)
		{
		     case RED:
		    	 System.out.println("The signal is RED.\n Kindly wait until it turns to GREEN.");
		         break;
		     case YELLOW:
			     System.out.println("The Signal is YELLOW.\n Kindly wait look around and move.");
		         break;
		     case GREEN:
			     System.out.println("The Signal is GREEN.\n Have a safe Ride.");
	             break;         
		}
	}
}
public class DemoEnum 
{
	public static void main(String[] args)
	{
		checkSignal myDrive=new checkSignal(Signal.GREEN);
		myDrive.makeRide();
	}

}
