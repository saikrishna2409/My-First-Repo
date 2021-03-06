package javaapp.bean.dao;
import java.util.List;

import javaapp.bean.Employ;


public interface EmployDAO {

	public boolean addEmploy(Employ employ);
	public boolean updateEmploy(Employ employ);
	public boolean deleteEmployee(Employ employ);
	public Employ getEmployById(int id);
	public List<Employ> getAllEmploy();
}
