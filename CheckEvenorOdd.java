import java.util.Scanner;

public class CheckEvenorOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a to check Even or Odd :-");
		int A = scan.nextInt();

	     if (A%2==0) {
			System.out.println(A+" "+ "is a Even Number");
		}
		else {
			System.out.println(A+" "+ "is a Odd Number");
		}
	}
	}
