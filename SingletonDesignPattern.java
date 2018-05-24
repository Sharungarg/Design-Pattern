package com.sharun.Vehicle;

class DamnWheeler implements VehicleInterface{
	private static DamnWheeler instance = null;
	
	private DamnWheeler(){}
	
	public static DamnWheeler getWheeler(){
		if(instance == null)
			instance = new DamnWheeler();
		else
			System.out.println("There can be only one Damn Wheeler and you have already got it");
			return instance;
	}

	public void vehicleIGot() {
		System.out.println("So you want a damn Wheeler That's pretty nice!");
	}
	
}


package com.sharun.DesignPrinciple;

import com.sharun.Vehicle.VehicleFactory;
import com.sharun.Vehicle.VehicleInterface;

public class SingletonVehicle {
	public static void main(String[] args){
		VehicleFactory hey_factory = new  VehicleFactory();
		VehicleInterface my_vehicle = hey_factory.giveVehicle(5);
		my_vehicle.vehicleIGot();
		VehicleInterface my_vehicle2 = hey_factory.giveVehicle(5);
		System.out.println(my_vehicle);
		System.out.println(my_vehicle2);
	}
}
