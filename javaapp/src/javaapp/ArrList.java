package javaapp;

import java.util.ArrayList;
import java.util.Collections;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Em> list =new ArrayList<Em>();
		Em emp1 =new Em(211,"Abin","Hyderabad",22,8888334678L,80000.00);
		Em emp2 =new Em(311,"bin","yderabad",23,9888334678L,70000.00);
		Em emp3 =new Em(411,"in","derabad",24,6888334678L,90000.00);
		Em emp4 =new Em(511,"n","erabad",25,7888334678L,10000.00);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		Collections.sort(list);
		System.out.println(list);
		for(Em em:list)
		{
			System.out.println(em);
		}
		

	}

}
