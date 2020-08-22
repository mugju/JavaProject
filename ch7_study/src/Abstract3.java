abstract class Vehicle{
	abstract void move();
}

class Car extends Vehicle{
	void move(){
		System.out.println("차도로 다닌다.");
	}
}

class Ship extends Vehicle{
	void move(){
		System.out.println("바닷길로 다닌다");
		
	}
}

class Plane extends Vehicle{
	void move(){
		System.out.println("하늘로 다닌다.");
	}
}

class VehicleUse{
	void getMoveMethod(Vehicle vehicle){
		vehicle.move();
	}
}

public class Abstract3{
	public static void main(String args[]){
		
		Car car = new Car();
		Plane plane = new Plane();
		Ship ship = new Ship();
		
		VehicleUse vs = new VehicleUse();
		
		vs.getMoveMethod(ship);
		vs.getMoveMethod(plane);
		vs.getMoveMethod(car);
	}
	
}