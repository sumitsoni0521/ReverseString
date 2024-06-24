import java.util.Scanner;

public class UsingMethod {
	// main function
	public static void main(String[] args) {
		// create a object
		//Create the object for the class and call the static method with the object as rev.reverse(str)) by passing the given string.
		UsingMethod rev = new UsingMethod();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Reverse of a string is : " + rev.reverse(str));
	}

	// Create a method
	static String reverse(String s) {
		String rev = " ";
		for (int i = s.length(); i > 0; i--) {
			rev = rev + (s.charAt(i - 1));
		}
		return rev;
	}
}
