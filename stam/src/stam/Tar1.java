package stam;

public class Tar1 {

	public static void main(String[] args) {

		String a = "adajljklkka";
		String b = "adaaadajkljklkkaajkljklkkkam";

		boolean ff = b.contains(a);
		System.out.println(ff);

//		for (int i = 0; i < b.length();) {
//			for (int j = 0; j < b.length() - a.length(); j++) {
//				i = 0;
//				while (a.charAt(i) == b.charAt(j) && i < a.length()) {
//					if (i == a.length() - 1) {
//						System.out.println("true");
//						return;
//					}
//					i++;
//					j++;
//				}
//			}
//			System.out.println("false");
//			return;
//		}
	}

}
