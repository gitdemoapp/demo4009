package com.mycar.innova;
import com.mycar.vehicle.Car;
public abstract class  Innova extends Car
{
	public abstract void totalNumberOfAirBags();

	public  void getEngineCapacity(){
		System.out.println("Innova engine capacity is 2400cc");
	}

	public abstract void getTotalNumberOfSeats();

	public abstract void getFuelType();
}
