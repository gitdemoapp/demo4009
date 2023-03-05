package com.bytecode.interface1;

import org.springframework.stereotype.Component;

@Component
public class BMWImpl implements Car {

	@Override
	public void maxSpeed() {
		System.out.println("BMW :-> max speed is 320 km/h");
	}

	@Override
	public void carService() {
		
		
	}

}
