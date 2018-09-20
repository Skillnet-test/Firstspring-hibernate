package org.saptarshi.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.javabrains.saptarshi.dto.Address;
import org.javabrains.saptarshi.dto.FourWheeler;
import org.javabrains.saptarshi.dto.TwoWheeler;
import org.javabrains.saptarshi.dto.UserDetails;
import org.javabrains.saptarshi.dto.Vehicle;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails userDetails=null;
		/*for(int i=0; i< 10; i++){
		userDetails=new UserDetails();		
		userDetails.setUserName("Four user");
		//Date date=new Date("2018-01-01");
		//userDetails.setJoinedDate(date);
		userDetails.setDescription(i+"- description");
			
		}*/
		
		/* vehicle and associate
		Vehicle vehicle=new Vehicle();
		vehicle.setVehicleName("Car");
		
		TwoWheeler bike=new TwoWheeler();
		bike.setVehicleName("Bike");
		bike.setSteeringHandle("bike steering handle");
		
		FourWheeler car=new FourWheeler();
		car.setVehicleName("Porche");
		car.setSteeringWheel("Proche steering wheel");*/		
		
		/*Vehicle vehicle1=new Vehicle();
		vehicle1.setVehicleName("Jeep");
		*/	
		// for one to many relation
		/*userDetails.getVehicle().add(vehicle);
		userDetails.getVehicle().add(vehicle1);
		*/
		// for many to one
		//vehicle.getUserDetails().add(userDetails);
		//vehicle1.getUserDetails().add(userDetails);	
		
		
		/*Address address=new Address();
		address.setStreet("street name");
		address.setState("west bengal");
		address.setPincode("pincode");
		address.setCity("city");
		
		Address officeAddress=new Address();
		officeAddress.setStreet("office street name");
		officeAddress.setState("office west bengal");
		officeAddress.setPincode("office pincode");
		officeAddress.setCity("office city");
		*/
		
		/*Address address1=new Address();
		address1.setStreet("first street");
		address1.setState("first state");
		address1.setPincode("first pin code");
		address1.setCity("first city");
		
		Address address2=new Address();
		address2.setStreet("second street");
		address2.setState("second state");
		address2.setPincode("second pincode");
		address2.setCity("second city");
		
		userDetails.getListofAddresses().add(address1);
		userDetails.getListofAddresses().add(address2);	
		*/
		
		//userDetails.setHomeaddress(address);
		//userDetails.setOfficeaddress(officeAddress);
		/*userDetails.setJoinedDate(new Date());
		userDetails.setDescription("description of the user");
		*/
		
		// for saving
		//SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
	
		/*Session session=sessionFactory.openSession();
		session.beginTransaction();
		for(int i=0; i< 10; i++){
			userDetails=new UserDetails();		  // transient state
			userDetails.setUserName("Four user");
			//Date date=new Date("2018-01-01");
			//userDetails.setJoinedDate(date);
			userDetails.setDescription(i+"- description");
			session.save(userDetails);
				
		}
		
		//session.save(vehicle);
		//session.save(bike);
		//session.save(car);
		session.getTransaction().commit();
		session.close();*/
		
		//retriving and delete and updating
		
		//userDetails=null;
		/*Session session=sessionFactory.openSession();
		session.beginTransaction();
		userDetails=(UserDetails)session.get(UserDetails.class, 2);
		userDetails.setDescription("this is 2nd description");
		session.save(userDetails); //  persistant state
		
		userDetails.setDescription("2nd description again"); // persistant object -update will work even after save
		//session.update(userDetails);
		//session.delete(userDetails);
		session.getTransaction().commit(); // optional in case of retriving
		session.close();
		
		userDetails.setDescription("2nd description again again");  // detattached state retrive will work but update will not
		//System.out.println("the size of address:-"+userDetails.getListofAddresses().size());
		System.out.println("the user to string:-"+userDetails.getDescription());	
		//vehicle=session.get(Vehicle.class, 1);
		//System.out.println("the vehicle to string:-"+vehicle.toString());
*/		
		// end of retriving
		// start of hql
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		
		Query query=session.createQuery("from UserDetails where userId > 5"); // UserDetails is class name not the table name
		List list=query.list();	
		
		session.getTransaction().commit();
		session.close();
		System.out.println("size of list "+list.size());
		
		

	}

}
