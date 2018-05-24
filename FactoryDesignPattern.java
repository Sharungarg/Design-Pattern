package com.sharun.Vehicle;

public interface Vehicle {
	void vehicleIGot();
}

class ThreeWheeler implements Vehicle{
	public void vehicleIGot(){
		System.out.println("I'm sorry but you got to settle on an Auto");
	}
}

class FourWheeler implements Vehicle{
	public void vehicleIGot(){
		System.out.println("Okay so you got a BMW");
	}
}

class TwoWheeler implements Vehicle {
	public void vehicleIGot(){
		System.out.println("Okay so you got a harley davidson");
	}
}

public class VehicleFactory {
	public Vehicle giveVehicle(int wheels){
		if(wheels == 2)
			return new TwoWheeler();
		else if(wheels == 3)
			return new ThreeWheeler();
		else 
			return new FourWheeler();
	}
}


//creating a vehicle object by giving parameter to the VehicleFactory Class

package com.sharun.DesignPrinciple;
import com.sharun.Vehicle.*;


public class FactoryExampleVehicle {
	public static void main(String[] args){
		
		VehicleFactory hello_factory = new VehicleFactory();
		Vehicle my_vehicle = hello_factory.giveVehicle(4);
		my_vehicle.vehicleIGot();
	}
}
