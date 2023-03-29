package homework;

public class Lab7tar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sara Shara Shir Sameach";
		char[] caracters = str.toCharArray();

		int r = 0;

		for (int i = 0; i < caracters.length; i++) {
			switch (caracters[i]) {
			case 'A', 'a', 'I', 'i', 'E', 'e', 'U', 'u', 'O', 'o':
				r++;

			}
		}
		System.out.println(str);
		System.out.println(r);
	}
}
