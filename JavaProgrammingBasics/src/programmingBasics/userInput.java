package programmingBasics;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age, weight : ");
		int age = sc.nextInt();
		float weight = sc.nextFloat();
		System.out.println("Your age, weight " + age + " " + weight);
		sc.nextLine();
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		System.out.print("Your age, weight and name is " + age + " " + weight + " " + name);

	}

}
