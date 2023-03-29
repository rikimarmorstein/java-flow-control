package e.ui;

public class Bustest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus[] barr = new Bus[5];
		for (int i = 0; i < barr.length; i++) {
			barr[i] = new Bus();
		}
		for (int i = 0; i < barr.length; i++)
			System.out.println(barr[i].getId());

		System.out.println(barr[4].getCompany());
		barr[4].setCompany("nisaan");
		System.out.println(barr[4].getCompany());
		System.out.println(barr[2].getPrice());
		barr[2].setPrice(20_000);
		System.out.println(barr[2].getPrice());
	}

}
