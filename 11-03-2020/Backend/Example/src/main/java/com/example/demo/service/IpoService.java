package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.IpoDto;
import com.example.demo.models.Ipos;
import com.example.demo.models.Users;

public interface IpoService {

	public String  addIpo(IpoDto pd);
	public void deleteIpo(int id);
	public String updateIpo(IpoDto pd);
	public Ipos getIpoById(int id);

	public List<Ipos> getAllIpo();
}
