package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraytoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<Integer>l1=new ArrayList<Integer>();
				l1.add(1);
				l1.add(3);
				l1.add(2);
				List<String>l2=new ArrayList<String>();
				l2.add("Where r u");
			//	List<Integer,String>l3=new ArrayList<Integer,String>();
//				l3.addAll(l1);
//				l3.addAll(l2);
//		        String[] array = new String[l1.size()];
//		        l1.toArray(array);
//		        System.out.println(l1.toString());
//		        Set<String> set = new HashSet<>(Arrays.asList(array));
//		        System.out.println("Set: " + set);
		        List l4 =new ArrayList();
		        l4.addAll(l1);
		        l4.addAll(l2);
		        //System.out.println(l4);
		        Object[] obj = l4.toArray();
		        for(int i=0;i<l4.size();i++)
		        {
		        	System.out.println(obj[i]);
		        }
		        	
		        
		    }
		}


