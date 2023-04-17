package controlstatements;
public class NestedIf {
	public static void main(String[] args) {
		int marks = 200;
		if (marks>=500)
		{
			System.out.println("marks greater than 500");
			if (marks>550) {
				System.out.println("Eligible for A+");
			}
			else {
				System.out.println("Eligible for A");
			}
		}
		else
		{
			System.out.println("marks less than 500");
			if (marks>400) {
				System.out.println("Eligible for B+");
			}
			else if (marks>300) {
				System.out.println("Eligible for B");
			}
			else {
				System.out.println("Eligible for C");
			}
		}
	}
}
