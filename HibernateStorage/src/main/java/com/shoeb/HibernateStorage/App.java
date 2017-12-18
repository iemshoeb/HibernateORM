package com.shoeb.HibernateStorage;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 

    	Employee emp=new Employee();
    	emp.setEmpID(104);
    	emp.setEmpName("Hugg");
    	emp.setEmpDep("Marketing");
    	emp.setSalary(12000.00);
    	
    	//Persisting these data in the database
    	//Session int from hibernate framework
    	

		//To use the Configuation of the hibernate for the Entity class Which would ofcourse should be annotated.
    	 Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
    	 

 		//To avoid the Deprecated method warning of the buildSessionFactory() method. by passing obj of ServiceRegistry 
 		//interface to the buildSessionFactory(reg) method like this .
    	 
 		ServiceRegistry reg =new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
 		

		//TO obtain the openSession() method using SessionFactory interface in order to use the openSession() method.
    	SessionFactory sf=con.buildSessionFactory(reg);
    	
		//To open the Session for the Transaction
    	Session session=sf.openSession();
    	

		//TO begin the transaction from the DB.
		org.hibernate.Transaction tx=session.beginTransaction();
    	
    	session.save(emp);

		//To save the data in the DB 
    	tx.commit();

    	System.out.println(emp);
    	
 
    }
}
