package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.repo.UsersRepo;


@CrossOrigin(origins="*")
@RestController
public class UsersRestServiceController {
	
	@Autowired
	UsersRepo ur;
	
	@Autowired
	JavaMailSender jms;
	@RequestMapping(value="/users",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> findAll() {
		return ur.findAll();
	}
	
	@RequestMapping(value="/users/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Users findOne(@PathVariable int id) {
		Optional<Users> usr = ur.findById(id);
		Users us = usr.get();
		return us;
	}
	
	@RequestMapping(value="/users",method= RequestMethod.POST)
	public Users save(@RequestBody Users usr) {
		Users us = ur.save(usr);
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("w.saikrishnakumarraju1234@gmail.com");
			sm.setTo("w.saikrishnakumarraju1234@gmail.com");
			sm.setSubject("testing mail...");
			sm.setText("Account created click on <a href ='http://localhost:4200/activate?"+us.getEmail()+"'>Click</a>");
			jms.send(sm);
			System.out.println("sending mail...");
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return us;
	}
	
	@RequestMapping(value="/users/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		ur.deleteById(id);
	}
	
	@RequestMapping(value="/users",method= RequestMethod.PUT)
	public Users update(@RequestBody Users usr) {
		Users us = ur.save(usr);
		return us;
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String reg() {
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("w.saikrishnakumarraju1234@gmail.com");
			sm.setTo("w.saikrishnakumarraju1234@gmail.com");
			sm.setSubject("testing mail...");
			sm.setText("this is testing mail");
			jms.send(sm);
			System.out.println("sending mail...");
		}
		catch (Exception e){
			e.printStackTrace();
		}
	
	return "{\"reg\":\"ok\"}";
	}

	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public Users activate(@RequestBody String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	System.out.println("emil ::"+str);
	Users u=	ur.findByEmail(str);
	System.out.println("uname :"+u.getUsername());
	u.setActive("yes");
		Users us = ur.save(u);
		return us;
	}




}
