package b.flow.control.ifDemo;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int grade = (int) (Math.random()*11);
		System.out.println("grade is " + grade);
		if (grade <=5) {
			System.out.println("fail");
		} else if (grade <=8) {
			System.out.println("good");

		}else if (grade <=10) {
			System.out.println("exellente");

		}
		}
}
