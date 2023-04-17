package controlstatements;

public class ForLoop_ex1 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum = sum +i;
			System.out.println(" value of i "+i+" current sum is "+sum);
		}
		System.out.println("sum of all numbers is : "+sum);

	}

}
