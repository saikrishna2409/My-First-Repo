package javaapp.daoimpl;

import java.util.ArrayList;
import java.util.List;


import javaapp.bean.Employ;
import javaapp.bean.dao.EmployDAO;
public class EmployDAOImpl implements EmployDAO{
	
static ArrayList<Employ> list =null;
static {
	list = new ArrayList<Employ>();
	Employ emp1 = new Employ(101, "Abin", "Hydrabad", 22, 6678687687L, 6786868.00);
	Employ emp2 = new Employ(102, "Anu", "Chennai", 21, 345354354L, 45464646.00);
	list.add(emp1);
	list.add(emp2);
}

@Override
public boolean addEmploy(Employ employ) {

	try {
		list.add(employ);
		return true;
	} catch (Exception e) {

		e.printStackTrace();
		return false;
	}
}

@Override
public boolean updateEmploy(Employ employ) {
	for(Employ emp : list)
	{
		if(emp.getId()==employ.getId())
		{
			list.set(list.indexOf(emp), employ);
			return true;
		}
		
	}
	return false;
}

@Override
public boolean deleteEmployee(Employ employ) {
//	try {
		//list.remove
	//}
	
	return false;
}

@Override
public Employ getEmployById(int id) {

	for (Employ employ : list) {
		if (employ.getId() == id) {
			return employ;
		}
	}
	return null;
}


@Override
public List<Employ> getAllEmploy() {
	// TODO Auto-generated method stub
	for(Employ e2:list)
	{
	System.out.println(list);	
	}
}

}
