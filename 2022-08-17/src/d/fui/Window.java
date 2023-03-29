package d.fui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame fr = new JFrame("my...");
		fr.setBounds(200, 200, 300, 200);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLayout(null);
		JLabel l1 = new JLabel("first ");
		l1.setBounds(20, 20, 150, 25);
		fr.add(l1);

		fr.setVisible(true);

		System.out.println(fr.getX());
	}

}
