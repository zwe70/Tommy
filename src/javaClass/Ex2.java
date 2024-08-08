package javaClass;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter input : ");
		int n = scanner.nextInt();
		int result = 1;
		for(int i = 1;i <= n;i++) {
			result *= i;
		}
		System.out.println("The factorial of " + n + " is " + result + ".");
		
		
	}

}
