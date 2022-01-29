package sample;
import java.util.Scanner;
public class Sample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a failure");
		String n = sc.nextLine();
		if(n=="yes") {
			System.out.println(true);
		}
		else {
			System.out.print("however you are a failure!!!");
		}
	}
}
