import java.util.Scanner;
public class UsingWhileLoop {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.nextLine();
		System.out.println("Reverse of a String '" + str + "' is  :");
		int i = str.length();
		while (i > 0) {
			System.out.print(str.charAt(i - 1));
			i--;
		}
	}
}
