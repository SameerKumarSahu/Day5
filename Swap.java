import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Number :-");
		int X = scan.nextInt();
		System.out.print("Enter Second Number :-");
		int Y = scan.nextInt();
		int temp;
		System.out.println("Before Swapping " + "X="+X +" "+"Y="+ Y);
		temp = X;
		X=Y;
		Y=temp;

		System.out.println("After Swapping " + "X="+X +" "+"Y="+ Y);
	}

}
