package stam;

public class Tar2 {

	public static void main(String[] args) {
		String[] colors = { "blue", "blue", "green", "green", "red", "blue" };
		int a = 0;
		int b = colors.length / 2;
		int s = colors.length / 2 - 1;
		int c = colors.length - 1;

		String[] colors2 = new String[colors.length];

		for (int i = 0; i < colors.length; i++) {
			if (colors[i] == "blue") {
				if (colors2[a] == null) {
					colors2[a] = colors[i];
				} else {
					// if(colors2[b]==null) {
					colors2[b] = colors2[a];
					colors2[a] = colors[i];
				}
				a++;
			}
			if (colors[i] == "red") {
				if (b < colors2.length && colors2[b] == null) {
					colors2[b] = colors[i];
					b++;
				} else {
					colors2[s] = colors[i];
					s--;
				}
			}
			if (colors[i] == "green") {
				if (colors2[c] == null) {
					colors2[c] = colors[i];
				} else {
					colors2[s] = colors2[c];
					colors2[c] = colors[i];
					s--;
				}
				c--;
			}
		}

		for (int i = 0; i < colors2.length; i++) {
			System.out.print(colors2[i] + ", ");
		}
	}

}
