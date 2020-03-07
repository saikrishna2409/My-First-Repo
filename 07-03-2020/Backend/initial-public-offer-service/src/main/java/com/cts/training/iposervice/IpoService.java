package com.cts.training.iposervice;

import java.util.List;

public interface IpoService {

	public String  addIpo(IpoDto pd);
	public void deleteIpo(int id);
	public String updateIpo(IpoDto pd);
	public Ipos getIpoById(int id);

	public List<Ipos> getAllIpo();
}
