package com.bytecode.service.impl;

import org.springframework.stereotype.Service;

import com.bytecode.service.VehicleService;
@Service
public class CarService implements VehicleService {

	@Override
	public void getVehicleService() {
		System.out.println("We are providing car service...");
	}

}
