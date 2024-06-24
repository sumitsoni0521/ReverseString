import java.util.Scanner;

public class UsingForLoop {
	public static void main(String[] args) {
		String str;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		System.out.println("Reverse of a String ' " + str + " ' is : ");
		for (int i = str.length(); i > 0; --i) {
			System.out.print(str.charAt(i - 1));
		}
	}
}