package javaapp;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Consider the string str="Global Warming"
			    Write statements in Java to implement the following
			    a) To display the last four characters.
			    b) To display the substring starting from index 4 and ending at index 8.
			    c) To check whether string has alphanumeric characters or not.
			    d) To trim the last four characters from the string.
			    e) To trim the first four characters from the string.
			    f) To display the starting index for the substring "Wa".
			    g) To change the case of the given string.
			    h) To check if the string is in title case.
			    i) To replace all the occurrences of letter "a" in the string with "*"   */
		String sb =new String("Global Warming");
		System.out.println(sb.substring(sb.length()-4, sb.length()));
		System.out.println(sb.substring(4, 9));
		System.out.println(sb.matches("[a-zA-Z0-9]+"));
		//System.out.println(sb.(4));
		//System.out.println(sb.toU);
		System.out.println(sb.substring(0,sb.length()-4));
		StringBuffer b=new StringBuffer("Global Warming");
		System.out.println(b.insert(0,"Wa"));
		System.out.println(sb.toUpperCase());
		System.out.println(sb.toLowerCase());
		System.out.println(b.toSwapCase());
		StringBuilder s =new StringBuilder();
		System.out.println(toTitleCase());
		System.out.println(sb.replace("a","*"));
		
		
		
		

	}

}
