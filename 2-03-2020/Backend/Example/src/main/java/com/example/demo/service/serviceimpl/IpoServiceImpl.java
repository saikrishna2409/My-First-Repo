package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.example.demo.dto.IpoDto;
import com.example.demo.models.Ipos;
import com.example.demo.repo.IpoRepo;
import com.example.demo.service.IpoService;
@Service
public class IpoServiceImpl implements IpoService{
	@Autowired
	IpoRepo ipoRepo;
	@Autowired
	JavaMailSender jms;
	@Override
	public String addIpo(IpoDto ip) {
		Ipos ipo =new Ipos();
		BeanUtils.copyProperties(ip, ipo);
		ipo=ipoRepo.save(ipo);
		if(ipo!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}
		
	@Override
	public void  deleteIpo(int id) {
		ipoRepo.deleteById(id);
	}
	@Override
	public List<Ipos> getAllIpo() {
		return ipoRepo.findAll();
	}
	@Override
	public Ipos getIpoById(int id) {
		// TODO Auto-generated method stub
		Optional<Ipos> ipo  =ipoRepo.findById(id);
		Ipos i =ipo.get();
		return i;
	}
	@Override
	public String updateIpo(IpoDto ip) {
		Ipos ipo = new Ipos();
		BeanUtils.copyProperties(ip, ipo);
		ipo=ipoRepo.save(ipo);
		if(ipo!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	
	

}
