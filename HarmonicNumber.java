import java.util.Scanner;
public class HarmonicNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("The Harmonic Value N is :-");
		int N = scan.nextInt();
		int i =0;
		double result =0.0;
			if (N>0) {

				while (N>0) {
				result=result +(double) 1/N;
				N--;
				}
			}

			else {
				System.out.println("Enter a the value of N greater than 1");
			}
			System.out.println(result);
		}

	}
