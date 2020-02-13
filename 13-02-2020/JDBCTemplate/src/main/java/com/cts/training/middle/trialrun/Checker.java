package com.cts.training.middle.trialrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.middle.dao.TrialUserDao;
import com.cts.training.middle.dao.impl.TrialUserDaoImpl;
import com.cts.training.middle.trialmodels.TrialUser;

public class Checker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("./beans.xml");
		TrialUserDao trialdao = (TrialUserDao) context.getBean("trialUserDaoImpl");
		
		//TrialUser user = new TrialUser(103,"saikrishna","saikrishna@gmail.com","saikrishna123");
		//TrialUserDaoImpl tr = new TrialUserDaoImpl();
		//trialdao.saveUser(user);
		
		
		//System.out.println(trialdao.getAllUsers());
		
		
//		TrialUser user =trialdao.getUserById(101);
//		System.out.println(user);
//		TrialUser user =trialdao.getUserById(101);
//		trialdao.deleteUser(user);
		//System.out.println(trialdao.getAllUsers());
		TrialUser user =trialdao.getUserById(103);
		user.setName("sal");
		trialdao.updateUser(user);
		System.out.println(trialdao.updateUser(user));
		
		

	}
}
	