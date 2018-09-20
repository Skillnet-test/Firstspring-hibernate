package org.javabrains.saptarshi.dto;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;


@Entity
//@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {
	
	private String SteeringWheel;

	public String getSteeringWheel() {
		return SteeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		SteeringWheel = steeringWheel;
	}
	

}
