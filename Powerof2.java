import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Power of value N is :-");
		int n = scan.nextInt();
		int i = 0;
		int b=1;
		if (n<=31) {
			while (i <= n) {
				System.out.println("2^"+i+"="+b);
				 b = 2*b;
				i++;

			}
		}
		else {
			System.out.println("Invalid power input");
		}

	}

}
