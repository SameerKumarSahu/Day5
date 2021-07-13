import java.util.Scanner;

public class VowelorConsonant {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Character :-");
	char ch;
	 ch= scan.next().charAt(0);
	 if (ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'||
		 ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' ) {
		 System.out.println("Vowel");
		 }
	 else {
		 System.out.println("Consonant");
	 }
}
}
