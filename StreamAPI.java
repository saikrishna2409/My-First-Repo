package javaapp.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javaapp.Em;

public class StreamAPI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List<String> names =new ArrayList<String>();
		
		
		addNames(names);
		names.forEach(System.out::println);
		List<String> lengthScale =names.stream().filter(s -> s.length()>=7).collect(Collectors.toList());
		System.out.println("The names which has length greater than 7 :\n");
		lengthScale.forEach(System.out::println);
		//Print all the names in capital
		List<String> capNames =names.stream().map(s-> s.toUpperCase()).collect(Collectors.toList());
		System.out.println("The names in capital letters:\n");
		capNames.forEach(System.out::println);
	}
	private static void addNames(List<String> names) {
		names.add("Abin Joshy");
		names.add("Sai Krishna");
		names.add("Aniket Andhale");
		names.add("Nagasri");
		names.add("Syed");
	}

}*/
		List<Em> em =new ArrayList<Em>();
		addEm(em);
		//em.forEach(System.out::println);
		List<Em> ageScale =em.stream().filter(emp -> emp.getAge()<22 && emp.getAddress().equals("Chennai")).collect(Collectors.toList());
		System.out.println("Employees with age less than 22: \n");
		ageScale.forEach(System.out::println);
		
		
		List<Em> lengthScale =em.stream().filter(s -> s.getName().length()>5).collect(Collectors.toList());
		System.out.println("The names which has length greater than 7 :\n");
		lengthScale.forEach(System.out::println);
	//	List<Double> lengthScale1 =em.stream().map(e -> e.getSalary()*1.1).collect(Collectors.toList());
		List<Em> salaryScale =em.stream().map(emp ->{
			emp.setSalary(emp.getSalary()*1.1);
			return emp;
		}).collect(Collectors.toList());
		System.out.println("Salary incremented:\n");
		salaryScale.forEach(System.out::println);
}

	private static void addEm(List<Em> em) {
		// TODO Auto-generated method stub
		
	Em e1 =new Em(211,"Abin","Hyderabad",22,67876789L,6890.00);	
	Em e2 =new Em(101,"Anu","Chennai",23,47876789L,76890.00);	
	Em e3 =new Em(103,"Tanu","Delhi",20,57876789L,96890.00);	
	Em e4 =new Em(111,"Prudvi","Banglore",26,97876789L,26890.00);	
	Em e5 =new Em(102,"Aniket","Chennai",21,87876789L,46890.00);	
	em.add(e1);
	em.add(e2);
	em.add(e3);
	em.add(e4);
	em.add(e5);
		
	}
}