import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Number to find the prime factors:-");
		int N = scan.nextInt();
		int i=2;
		while (N>1) {
			if (N%i==0) {
				System.out.print(i+",");
				N=N/i;
			}
			else {
				i++;
			}
		}
	}

}
