package com.example.demo.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SectorDto;
import com.example.demo.models.Sector;
import com.example.demo.repo.SectorRepo;
import com.example.demo.service.SectorService;
@Service
public class SectorServiceImpl implements SectorService{
	@Autowired
	SectorRepo sectorRepo;
	@Autowired
	JavaMailSender jms;
	@Override
	public String addSector(SectorDto se) {
		Sector sec =new Sector();
		BeanUtils.copyProperties(se, sec);
		sec=sectorRepo.save(sec);
		if(sec!=null) {
			return "{\"res\":\"1\"}";
		}
		else {
			return "{\"res\":\"0\"}";
		}
	}
		
	@Override
	public void  deleteSector(int id) {
		sectorRepo.deleteById(id);
	}
	@Override
	public List<Sector> getAllSector() {
		return sectorRepo.findAll();
	}
	@Override
	public Sector getSectorById(int id) {
		// TODO Auto-generated method stub
		Optional<Sector> sec  =sectorRepo.findById(id);
		Sector s =sec.get();
		return s;
	}
	@Override
	public String updateSector(SectorDto se) {
		Sector sec = new Sector();
		BeanUtils.copyProperties(se, sec);
		sec=sectorRepo.save(sec);
		if(sec!=null) {
		return "{\"res\":\"1\"}";}
		else {
			return "{\"res\":\"0\"}";
		}
	}

	
	
}
