import java.util.Scanner;

public class UsingArray {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		// array define
		char[] ch = str.toCharArray();
		System.out.println("Reverse of a string is : ");
		int j = str.length();
		for (int i = j; i > 0; i--) {
			System.out.print(ch[i - 1]);
		}
	}
}
