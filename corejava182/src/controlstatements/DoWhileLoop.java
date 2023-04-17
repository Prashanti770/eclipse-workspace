package controlstatements;

public class DoWhileLoop {

	public static void main(String[] args) throws InterruptedException {
		int i=1;
		do {
			System.out.println(i);
			Thread.sleep(1000);
			if(i==5) {
				continue;
				
			}
			i++;
			break;
		}
		while(i<=10);

	}

}
