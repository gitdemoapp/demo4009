package com.mycar.baleno;
import com.mycar.vehicle.Car;
public abstract class  Baleno extends Car
{
	public abstract void totalNumberOfAirBags();

	public  void getEngineCapacity(){
		System.out.println("Baleno engine capacity is 1200cc");
	}

	public  void getTotalNumberOfSeats(){
		System.out.println("Total number of seats in every baleno is five...");
	}

	public abstract void getFuelType();
}
