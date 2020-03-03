package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.dto.SectorDto;
import com.example.demo.models.Sector;
import com.example.demo.repo.SectorRepo;
import com.example.demo.service.SectorService;

public class SectorRestServiceController {
	@Autowired
	SectorRepo sectorRepo;
	@Autowired
	SectorService sectorService;
	
	@RequestMapping(value="/sector",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Sector> findAll() {
		return sectorRepo.findAll();
	}
	
	@RequestMapping(value="/sector/{id}",method= RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public Sector findOne(@PathVariable int id) {
		Optional<Sector> se = sectorRepo.findById(id);
		Sector i = se.get();
		return i;
	}
	
	@RequestMapping(value="/sector",method= RequestMethod.POST)
	public String save(@RequestBody SectorDto se) {
	String sector =sectorService.addSector(se);
		return sector;
	}
	
	@RequestMapping(value="/sector/{id}",method= RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		sectorService.deleteSector(id);
	}
	
	@RequestMapping(value="/sector",method= RequestMethod.PUT)
	public String update(@RequestBody SectorDto se) {
	//	Company company = companyRepo.save(usr);
		String sector =sectorService.updateSector(se);
		return sector;
	}
}
