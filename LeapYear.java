import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Year, ensure it is a 4 digit number.");
	int a = scan.nextInt();
	if ((a % 4 == 0) || (a % 400 ==0) && (a % 100 != 0)) {
		System.out.println( a +" " + "is a leap year");
	}
	else {
		System.out.println(a+" " + "is not a leap year");
	}

}
}
