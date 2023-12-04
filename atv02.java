package atividadestr;

public class atv02 {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="HELLO";
		boolean b1 = s1.equals("Hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println("b1: " + b1 + ", b2: " + b2 + ", b3: " + b3 + ", b4: " + b4);
	}

}



