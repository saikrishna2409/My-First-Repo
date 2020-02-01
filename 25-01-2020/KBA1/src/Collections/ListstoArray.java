package Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListstoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("a");
		l1.add("ab");
		String[] array =new String[l1.size()];
		l1.toArray(array);
		System.out.println(Arrays.toString(array));
		l1.add("adb");
		System.out.println(l1);
		String[] array1 =new String[l1.size()];
		l1.toArray(array1);
		System.out.println(Arrays.toString(array1));
	}

}
