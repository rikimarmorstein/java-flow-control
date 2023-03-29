package d.homework;

public class Testairplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Airplane airp=new Airplane();
		
		airp.goHigher10Yards();		

 System.out.println(airp.altitude);


 
 airp.turnSouth();
 System.out.println(airp.direction);
 
 airp.turnEast();
 System.out.println(airp.direction);
 
 airp.turnSouth();
 System.out.println(airp.direction);
 
 airp.turnWest();
 System.out.println(airp.direction);
 
	}

}
