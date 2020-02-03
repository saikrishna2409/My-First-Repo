package com.cts.training.controller;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import com.cts.training.model.Developer;
import com.cts.training.model.Technology;
public class TechController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session =sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		Criteria criteria = session.createCriteria(Developer.class);
		criteria.add(Restrictions.eq("id", 1L));
		Developer developer = (Developer) criteria.uniqueResult();
		System.out.println(developer.toString());
		Set<Technology> tech = developer.getTechnology();
		for(Technology technology : tech){
		  System.out.println(technology.toString());
		}
		Developer d1= new Developer();
		d1.setName("Aniket");
		Developer d2= new Developer();
		d1.setName("Abin");
		Developer d3= new Developer();
		d1.setName("Sai");
		Technology t1=new Technology();
		t1.setLanguage("java");
		t1.setExpertise("Intermediate");
		Technology t2=new Technology();
		t2.setLanguage("Bootstrap");
		t2.setExpertise("Expert");
		Set<Technology> ts= new HashSet<Technology>();
		ts.add(t1);
		ts.add(t2);
		d1.setTechnology(ts);
		d2.setTechnology(ts);
		session.save(d1);
		session.save(d2);
		tx.commit();
		session.close();
	}
}



