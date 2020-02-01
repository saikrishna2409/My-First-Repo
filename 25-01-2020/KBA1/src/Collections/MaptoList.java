package Collections;
import java.util.*;
public class MaptoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m =new HashMap<Integer,String>();
		m.put(1,"Krishna");
		m.put(2, "Abin");
		m.put(3,"Aniket");
		List<Integer> l1 = new ArrayList(m.keySet());
		List<String> l2 = new  ArrayList(m.values());
		System.out.println(l1);
		System.out.println(l2);
	}

}
