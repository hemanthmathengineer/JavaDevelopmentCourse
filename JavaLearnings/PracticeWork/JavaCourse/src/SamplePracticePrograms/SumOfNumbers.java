package SamplePracticePrograms;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of your choice");
		int a = scanner.nextInt();
		
		int number = 0;
		while(a!=0) {
			number = number + a%10;
			a=number/10;
		}
		
		System.out.println("Sum of numbers in the inputted number is " + number);
		

	}

}
