package com.mycar.vehicle;
public abstract class Car
{
	public void totalNumberOfWheels(){
		System.out.println("Total number of wheels in every car is four...");
	}
    
	public abstract void totalNumberOfAirBags();

	public abstract void getEngineCapacity();

	public abstract void getTotalNumberOfSeats();

	public abstract void getFuelType();
}
