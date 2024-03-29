package com.cts.training.userservice;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	Logger logger =LoggerFactory.getLogger(this.getClass());
	@GetMapping(value ="/login")
	public ResponseEntity<?> login(HttpServletRequest request){
		String authorization =request.getHeader("Authorization");
		logger.info("Login attempt with token-->{}",authorization);
		String username =null;
		String password =null;
		if(authorization != null && authorization.startsWith("Basic")) {
			String base64Credentials =authorization.substring("Basic".length()).trim();
			byte[] credDecoded =Base64.getDecoder().decode(base64Credentials);
			String credentials =new String(credDecoded,StandardCharsets.UTF_8);
			username=credentials.split(":")[0];
			password=credentials.split(":")[1];
		}
		try {
			Users user =cs.getUserByUsernameAndPassword(username, password);
			logger.info("User logged in using username --> {}",username);
			return new ResponseEntity<Users>(user,HttpStatus.OK);
		}
		catch(Exception e)
		{
			System.out.println(e.getStackTrace());
			logger.info("Unauthorized Access Stack Trace -->{}",e.getStackTrace().toString());
			return new ResponseEntity<String>("No user Found",HttpStatus.NOT_FOUND);
		}
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
		usr.setUsertype("ROLE_USER");
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
	@GetMapping("/findByUsernameAndPassword/{username}/{password}")

	 public Users findByUsernameAndPasswordConfirm(@PathVariable("username") String username,@PathVariable("password") String password)

	 {

		 Optional<Users> user= ur.findByUsernameAndPassword(username, password);

		 
	 return user.get();

	 }

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
