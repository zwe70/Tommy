package javaClass;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		System.out.println("Multiplication Table for " + num);
		for(int i = num;i <= num;i++) {
			 for(int j = 1;j <= 10;j++) {
			System.out.println( i+ " * "+ j + " = " + i * j);
			
			 }
			 
		}
		
		
	}

}
