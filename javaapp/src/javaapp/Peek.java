package javaapp;

import java.util.PriorityQueue;

public class Peek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PriorityQueue<Integer> m = new PriorityQueue<Integer>();
		 m.add(1);
		 m.add(15);
		 m.add(10);
		 m.add(23);
		 
		// m.poll();
		 
		 System.out.println(m);
		 m.peek();
		 System.out.println(m);
		 //m.element();
		 
	}

}