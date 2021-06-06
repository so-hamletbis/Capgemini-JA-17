import java.util.Scanner;
import java.util.StringTokenizer;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the values: ");
		String values = sc.nextLine();
		StringTokenizer st = new StringTokenizer(values," ");
		System.out.println("Elements are: ");
		while(st.hasMoreTokens())
		{
			String str = (String)st.nextElement();
			int x = Integer.parseInt(str);
			System.out.println(x);
			sum += x;
			
		}
		System.out.println("Sum of all numbers: "+sum);
		sc.close();
	}

}