package homework;

public class Lab7tar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st = new String("John Bryce");
		char[] john = st.toCharArray();
		System.out.println(john);
//char [] john = {'J','o','h','n',' ','B','r','y','c','e'};
		int sum = 0;
		for (int i = 0; i < john.length; i++)
			if (john[i] == 'h') {
				sum += 1;
				System.out.println(sum);

			}

	}

}
