package stam;

public class Tar3 {

	public static void main(String[] args) {

		String a = "ssss";
		String b = a.substring(1);
		if (a.toLowerCase() == a || a.toUpperCase() == a || b.toLowerCase() == b || b.toUpperCase() == b) {
			System.out.println("true");
			return;
		}
		System.out.println("false");
	}

}
