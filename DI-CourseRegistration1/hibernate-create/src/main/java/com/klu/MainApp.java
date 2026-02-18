package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class MainApp {
public static void main(String[] args) {
	//Load Configuration & Create the SessionFactory
	SessionFactory factory=new Configuration()
			.configure().buildSessionFactory();
	
	//open session
	Session session=factory.openSession();
	
	//Begin Transcation
	Transaction tx=session.beginTransaction();
	
	//create the table object
	Student s=new Student("Ravi");
	
	//save the data / object
	session.save(s);
	
	//commit
	tx.commit();
	
	//close the connection
	session.close();
	factory.close();
}
}
