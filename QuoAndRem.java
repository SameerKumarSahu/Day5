import java.util.Scanner;

public class QuoAndRem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number :-");
		int num1 = scan.nextInt();
		System.out.print("Enter Second Number :-");
		int num2 = scan.nextInt();
		int Quo=num1 / num2 ;
		int Rem=num1 % num2 ;
		System.out.println("Quotient is "+ Quo);
		System.out.println("Remainder is "+ Rem);
}
}
