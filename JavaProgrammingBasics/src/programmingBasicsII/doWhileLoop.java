package programmingBasicsII;
import java.util.Scanner;

public class doWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= n);
		
	}

}
