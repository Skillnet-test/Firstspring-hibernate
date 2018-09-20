package org.javabrains.saptarshi.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;	
	//@Transientc
	private String userName;
	@Temporal(TemporalType.DATE)
	private Date joinedDate;
	@Lob
	private String description;
	/*@OneToMany
	@JoinTable(name="USER_VEHICLE",joinColumns=@JoinColumn(name="USER_ID"),
		inverseJoinColumns=@JoinColumn(name="VEHICLE_ID")
	
	)*/
	/*@OneToMany(cascade=CascadeType.ALL)
	private Collection<Vehicle> vehicle=new ArrayList<Vehicle>();
	*/
	
	/*@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET_NAME")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
	@AttributeOverride(name="pincode",column=@Column(name="HOME_PIN"))
	})
	private  Address homeaddress;
	@Embedded
	private  Address officeaddress;*/	
	
	/*@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="USER_ADDRESS",
		joinColumns=@JoinColumn(name="USER_ID")
			
	)*/
	//@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	//@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "auto", type = @Type(type="long"))
	//private Collection<Address> listofAddresses=new ArrayList<Address>();
	
	/*public Collection<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}
*/
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName
				+ ", joinedDate=" + joinedDate + "+, description=" + description + "]";
	}
	/*public Collection<Address> getListofAddresses() {
		return listofAddresses;
	}
	public void setListofAddresses(Collection<Address> listofAddresses) {
		this.listofAddresses = listofAddresses;
	}*/
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*public Address getHomeaddress() {
		return homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}*/

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName+" from getter";
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
		
	/*public Address getOfficeaddress() {
		return officeaddress;
	}
	public void setOfficeaddress(Address officeaddress) {
		this.officeaddress = officeaddress;
	}
	*/
	

}
