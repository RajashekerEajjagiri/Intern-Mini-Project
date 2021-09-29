package com.ltts.Flightproject.bo;

import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.Flightproject.model.User;

@Repository
public class UserBo {

	@Autowired
	SessionFactory sf;
	
	public boolean insertuser(User u) {
		System.out.println("Insise User-Beg");
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
		System.out.println("Inside User Bo-End");
	  return false;
	}
	
	public User checkUserByEmail(String email) {
		Session s=sf.openSession();
		s.beginTransaction();
		User u1=s.load(User.class, email);
		s.getTransaction().commit();
		return u1;
	}
	
	public boolean updateuser(User u) {
		
		Session s=sf.openSession();
		s.beginTransaction();
		s.saveOrUpdate(u);
		s.getTransaction().commit();
		s.close();
		 
	  return false;
	}
}
