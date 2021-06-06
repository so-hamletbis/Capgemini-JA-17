import java.util.Scanner;

public class Excercise2 {
	public static String getImage(String str) {
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		
		String s1=sb.toString();
		
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		
		System.out.println("The resultant String is:" + s + "|" + getImage(s));
		sc.close();
	}
}
