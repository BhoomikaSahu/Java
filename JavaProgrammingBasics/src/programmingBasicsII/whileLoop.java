package programmingBasicsII;
import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		int i = 1;
		while(i <= n) {
			int j = i;
			while(j <= n) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
