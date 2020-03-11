package com.cts.training.userservice;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class CreateAccountServiceImpl implements CreateAccountService {

	@Autowired
	UsersRepo ur;	
	@Autowired
	JavaMailSender jms;
	@Override
	public String addUser(Users pd) {
		Users us =new Users();
		//CreateAccountDto us;
		String email;
		try {
			SimpleMailMessage sm = new SimpleMailMessage();
			sm.setFrom("w.saikrishnakumarraju1234@gmail.com");
			sm.setTo(pd.getEmail());
			sm.setSubject("testing mail...");
			
			email = pd.getEmail();
			if (ur.findByEmail(email) != null) {
				return "{\"res\":\"0\"}";
			} else {
				BeanUtils.copyProperties(pd, us);
				ur.save(us);
				sm.setSubject("Testing mail....");
				sm.setText(
						"Account created click on 'http://localhost:4200/activate?" + us.getEmail() + "'>Click</a>");
				jms.send(sm);
				return "{\"res\":\"1\"}";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "{\"res\":\"2\"}";
		}
	}

	@Override
	public void  deleteUser(int id) {
		ur.deleteById(id);
	}
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
		
	}

	@Override
	public Users getUserById(int id) {
		// TODO Auto-generated method stub
		Optional<Users> usr =ur.findById(id);
		Users us =usr.get();
		return us;
	}

	@Override
	public String updateUser(Users pd) {
		Users us = new Users();
		BeanUtils.copyProperties(pd, us);
		us=ur.save(us);
		if(us!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}
	@Override
	public Users getUserByUsernameAndPassword(String username, String password) throws NoSuchElementException {
		Users user = ur.findByUsernameAndPassword(username, password).get();
		Users userDTO = new Users();
		BeanUtils.copyProperties(user, userDTO);
		return userDTO;
	}
	

}
