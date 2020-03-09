package com.cts.training.userservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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


@CrossOrigin("*")
@RestController
public class UsersRestServiceController {

	@Autowired
	UsersRepo ur;
	@Autowired
	CreateAccountService cs;

	@Autowired
	JavaMailSender jms;

	@GetMapping(value ="/login")
	public ResponseEntity<?> login(){
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getAllUsers() {
		List<Users> list = cs.getAllUsers();
		if(list.size()>0) {
			return new ResponseEntity<List<Users>>(list, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No users found",HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Users findOne(@PathVariable int id) {
		Optional<Users> usr = ur.findById(id);
		Users us = usr.get();
		return us;
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String save(@RequestBody Users usr) {
		String us =cs.addUser(usr);
		return us;
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		//ur.deleteById(id);
		cs.deleteUser(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.PUT)
	public String update(@RequestBody Users usr) {
	//	Users us = ur.save(usr);
		String us = cs.updateUser(usr);
		return us;
	}
//	@GetMapping("/findByUsernameAndPassword/{username}/{password}")
//
//	 public Users findByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password)
//
//	 {
//
//		 Users user= ur.findByUsernameAndPasswordAndConfirm(username, password,"yes");
//
//		 
//	 return user;
//
//	 }

//	@RequestMapping(value = "/reg", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public String reg() {
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("w.saikrishnakumarraju1234@gmail.com");
//			sm.setTo("w.saikrishnakumarraju1234@gmail.com");
//			sm.setSubject("testing mail...");
//			sm.setText("this is testing mail");
//			jms.send(sm);
//			System.out.println("sending mail...");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "{\"reg\":\"ok\"}";
//	}

	@RequestMapping(value="/activate",method= RequestMethod.PUT)
	public Users activate(@RequestBody String email) {
		String str=email.substring(email.indexOf(":")+2,email.lastIndexOf("\""));
	System.out.println("emil ::"+str);
	Users u=	ur.findByEmail(str);
	
	System.out.println("uname :"+u.getUsername());
	u.setActive(true);
		Users us = ur.save(u);
		return us;
	}
	
//	public void regi() {
//		try {
//			SimpleMailMessage sm = new SimpleMailMessage();
//			sm.setFrom("w.saikrishnakumarraju1234@gmail.com");
//			sm.setTo(email.getEmail());
//			sm.setSubject("Email  Activation");
//			sm.setText("www.facebook.com");
//			
//			jms.send(sm);
//			
//			System.out.println("sending mail...");
//		}
//		catch (Exception e){
//			e.printStackTrace();
//
//			return "{\"regi\":\"ok\"}";
//		}
//	
//	}
//	@RequestMapping(value = "/prod", method = RequestMethod.POST)
//	public ResponseEntity<CreateAccountDto> save(@RequestBody CreateAccountDto ca) {
//		cs.addUser(ca);
//		return new ResponseEntity<CreateAccountDto>(ca, HttpStatus.CREATED);
//	}

}
