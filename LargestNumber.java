import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number :-");
		int X = scan.nextInt();
		System.out.print("Enter Second Number :-");
		int Y = scan.nextInt();
		System.out.print("Enter Third Number :-");
		int Z = scan.nextInt();
		if (X>Y && X>Z) {
			System.out.println(X+"is the largest number among "+X+" "+Y+" "+Z);
		}
		else if ( Y>X && Y>Z) {
			System.out.println(Y+"is the largest number among "+X+" "+Y+" "+Z);
		}
		else {
			System.out.println(Z +" "+ "is the largest number among "+X+" "+Y+" "+Z);
		}
	}

}
