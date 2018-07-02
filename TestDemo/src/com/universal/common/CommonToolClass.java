package com.universal.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CommonToolClass {
	


     
    	 public  static Session getSession()
    		{
    			Configuration cfg= new Configuration();
    			cfg.configure();
    			SessionFactory sf=null;
    			
    				sf= cfg.buildSessionFactory();
    			
    			
    		     
    			Session session= sf.openSession();
    			return session;
    			
    			
    		}
     
     
	

}
