package javaapp;
import java.util.*;

class MapTest
{
  public static void main(String ... args)
  {
	  HashMap<String,Integer> map=new HashMap<>();
       map.put("one",100);
	   map.put("two",200);
	   map.put("three",300);
	   map.put("four",400);
	   map.put("one",500);
	   map.put("five",500);
	   map.put(null,700);
	   
	   for(Map.Entry entry : map.entrySet())
	   {
	   System.out.print(entry.getKey()+" ,");
	   System.out.print(entry.getValue()+" ,");
	   System.out.println(entry.getKey()+" -->"+entry.getValue());
	   }
	
  }
}

