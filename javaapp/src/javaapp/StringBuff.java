package javaapp;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("Thoraipakkam");
		//System.out.println(sb.capacity());
		sb.insert(3,"Krishna");
		System.out.println(sb);
		sb.delete(3,7);
		System.out.println(sb);
		sb.replace(5, 8, "LOP");
		System.out.println(sb);
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		
		
		/*sb.append(" Chennai");
		System.out.println(sb.capacity());
		sb.append(" Kurnool");
		System.out.println(sb.capacity());*/
	}

}
