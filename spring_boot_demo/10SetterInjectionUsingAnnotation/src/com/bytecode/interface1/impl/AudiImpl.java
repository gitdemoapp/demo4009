package com.bytecode.interface1.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bytecode.interface1.Car;
import com.bytecode.service.VehicleService;
import com.bytecode.service.impl.CarService;
@Component
public class AudiImpl implements Car {

	@Autowired
	private VehicleService vehicleService;
	
	public AudiImpl(){
		System.out.println("This is zero param constructor...");
	}
	
	/*@Autowired
	public AudiImpl(VehicleService vehicleService) {
		System.out.println("This is construtor...");
		this.vehicleService = vehicleService;
	}*/


	@Override
	public void maxSpeed() {
		System.out.println("Audi :-> max speed is 280 km/h");
	}


	public VehicleService getVehicleService() {
		return vehicleService;
	}

  /* @Autowired 
	public void setVehicleService(VehicleService vehicleService) {
    	System.out.println("This is setter method.........");
		this.vehicleService = vehicleService;
	}*/


	@Override
	public void carService() {
		vehicleService.getVehicleService();
	}

	 
}
