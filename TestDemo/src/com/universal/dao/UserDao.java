package com.universal.dao;

import org.hibernate.Session;

import com.universal.common.CommonToolClass;
import com.universal.dto.User;

public class UserDao {

	public static int insert(User u) {
		// TODO Auto-generated method stub
	Session session=	CommonToolClass.getSession();
		session.save(u);
		
		try
		{
			session.beginTransaction().commit();
		}
		
		catch(Exception e)
		{
			
			System.out.println("-------------"+e+"-----------");
		}
		return 1;
	}

}
