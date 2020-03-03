package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.Sector;

public interface SectorRepo extends JpaRepository<Sector, Integer>{

}
