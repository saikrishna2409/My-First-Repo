package com.cts.training.controller;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.cts.training.model.Actor;
import com.cts.training.model.Movie;
import com.cts.training.model.PassportDetails;
import com.cts.training.model.Person;
public class MappingController {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
	//	Criteria criteria =session.createCriteria(Person.class);
		//Person p = (Person) criteria.uniqueResult();
		//System.out.println(p.getName());
		
//		List<Person> persons =criteria.add(Restrictions.eq("name", "krishna")).list();
//		for(Person p:persons)
//		{System.out.println(p.getPassport().getPassno());
//			
//		}
//		
		Criteria criteria = session.createCriteria(Actor.class);
		criteria.add(Restrictions.eq("actorName", "Paul Walker"));
		Actor actor = (Actor) criteria.uniqueResult();

		System.out.println(actor);
		System.out.println(actor.getMovie());
		session.save(actor);
		
//		Movie movie= new Movie();
//		movie.setName("Furious 07");
//
//		Actor actor1 = new Actor();
//		actor1.setActorName("Vin Diesel");
//		actor1.setMovie(movie);
//
//		Actor actor2= new Actor();
//		actor2.setActorName("Paul Walker");
//		actor2.setMovie(movie);
//
//		Transaction transaction = session.getTransaction();
//		transaction.begin();
//		session.save(movie);
//		session.save(actor1);
//		session.save(actor2);
//		transaction.commit();
		
		
//		Person person=new Person();
//		person.setName("Hammemsha");
//		PassportDetails pDetails=new PassportDetails();
//		pDetails.setPassno("BTJ12463762");
//		pDetails.setPerson(person);
//		person.setPassport(pDetails);
//		//session.save(pDetails);
//		session.save(person);
		transaction.commit();
		session.close();
	}
}