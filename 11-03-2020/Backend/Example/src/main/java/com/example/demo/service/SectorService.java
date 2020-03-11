package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.SectorDto;
import com.example.demo.models.Sector;

public interface SectorService {
	public String  addSector(SectorDto se);
	public void deleteSector(int id);
	public String updateSector(SectorDto se);
	public Sector getSectorById(int id);

	public List<Sector> getAllSector();
}
