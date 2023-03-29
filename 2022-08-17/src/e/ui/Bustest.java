package e.ui;

public class Bustest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus1 = new Bus(54512, "red", "Nissan", 150_000);
		System.out.println(bus1.toString());

		Bus bus2 = new Bus();
		bus2.setNumber(879);
		bus2.setColor("yello");
		bus2.setCompany("honda");
		bus2.setPrice(50_000);
		bus2.print();

		
		
	}

}
