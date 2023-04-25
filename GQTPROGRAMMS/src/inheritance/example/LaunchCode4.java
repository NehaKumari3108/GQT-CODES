package inheritance.example;
abstract class Plane1{
	void takeOff() {
		System.out.println("plane is flying");
		}
	abstract void fly();
	  void land() {
		  System.out.println("plane landed");
    }
}
 class PassengerPlane1 extends Plane1{
	 //@override
	 void fly() {
		 System.out.println("Passanger plane fly at medium height");
	 }
 }
  class CargoPlane1 extends Plane1{
	  //@override
	  void fly() {
		  System.out.println("CargoPlane1 fly at great height");
		  
	  }
  }
  class FighterPlane1 extends Plane1{
	  //@override
	  void fly()
	  {
		  System.out.println("FighterPlane1 fly at great height");
    }
  }
  
  
  class Airport1 {
	  void PermitPlane(Plane1 p) {
		  p.takeOff();
		  p.fly();
		  p.land();
	  }
  }

public class LaunchCode4 {

	public static void main(String[] args) {
		PassengerPlane1 p=new PassengerPlane1();
		CargoPlane1 c=new CargoPlane1();
		FighterPlane1 f=new FighterPlane1();
		Airport1 a=new Airport1();
		
		
		a.PermitPlane(p);
		a.PermitPlane(c);
		a.PermitPlane(f);

	}

}
