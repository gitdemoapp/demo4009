package com.mycar;
import com.mycar.baleno.BalenoFactory;
import com.mycar.baleno.Baleno;
class MainCarApp 
{
	public static void main(String[] args) 
	{
		Baleno  baleno=BalenoFactory.getBalenoCar(args[0]);
		baleno.getEngineCapacity();
		baleno.getTotalNumberOfSeats();
		baleno.getFuelType();
	}
}
