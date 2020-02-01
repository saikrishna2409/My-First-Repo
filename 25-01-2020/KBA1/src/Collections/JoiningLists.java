package Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class JoiningLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("a");
		
		
		l1.add("ab");
		
		List<String> l3 = new ArrayList<String>();
		l3.add("abc");
		
		
		l3.add("abcd");
		
		List<String> join = new ArrayList<String>();
		join.addAll(l1);
		join.addAll(l3);
		System.out.println(join);
		

	}

}
