package f.targil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person(105, "dn", 15);
		Person p1=new Person(23, "dn", 15);
		Person p2=new Person(105, "dn", 15);

		int hash = p.hashCode();
		System.out.println(hash);
		System.out.println(p1.hashCode());
		
		String d1=new String("mm");
		String d2=new String("mm");

		System.out.println(p==p2);
		System.out.println(p.equals(p2));
	}

}
