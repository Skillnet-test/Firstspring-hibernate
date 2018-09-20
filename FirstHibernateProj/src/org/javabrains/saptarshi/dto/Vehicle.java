package org.javabrains.saptarshi.dto;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
/*@DiscriminatorColumn(
		name="VEHICLE_TYPE",
		discriminatorType=DiscriminatorType.STRING 
		
)
*/
public class Vehicle {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	private String vehicleName;
	
	/*@ManyToMany
	private Collection<UserDetails> userDetails=new ArrayList();
	
	public Collection<UserDetails> getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(Collection<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}*/
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName="
				+ vehicleName + "]";
	}
	

}
