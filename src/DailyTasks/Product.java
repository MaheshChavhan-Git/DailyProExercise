package DailyTasks;

import java.util.Scanner;

public class Product {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		int c = a*b;
		System.out.println("Product of given two numbers is : "+c);
		}
}
