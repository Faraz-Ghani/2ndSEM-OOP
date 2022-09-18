package pckg.Lab9;



interface BasicVehicle{
 public void runs();//abstract method
}
class bike implements BasicVehicle{//implementing the interface of basicvehicle

	public void runs() {
	System.out.println("This bike runs without issues");//implementing the abstract method of vehicle
}
	
	final int speedlimit= 40;//cannot change the value of final int speedlimit.
	
	public void Ride() {
		System.out.println("This bike can be taken for a ride");
	}
	
}

class sportbike extends bike{//inheriting all the methods and attributes of bike

	public void Ride() {
		super.Ride();//calling method of superclass to check wether bike can be take for a ride
		System.out.println("This bike is curising under the speed of "+ this.speedlimit+"kmph");
		//using this keyword to run to get the value of speedlimit of the sportbike class
	}
}
public class lab9task3 {
public static void main(String[] args) {
	sportbike r1 = new sportbike();
r1.Ride();
}
}
