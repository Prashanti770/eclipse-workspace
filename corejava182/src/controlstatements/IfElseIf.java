package controlstatements;

public class IfElseIf {

	public static void main(String[] args) {
		int marks = 900;
		if(marks>500) {
			System.out.println("Greater than 500");
		}
		else if(marks==500) {
			System.out.println("Equals to 500");
			
		}
		else if(marks < 500) {
			System.out.println("less than 500");
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
