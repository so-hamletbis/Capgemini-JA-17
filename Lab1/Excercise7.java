import java.util.*;

public class Excercise7 {
	public static boolean checkNumber(int number) {
		String s=String.valueOf(number);
		for(int i=0; i < s.length()-1;i++) {
			if(s.charAt(i)<s.charAt(i+1)) {
				continue;
			}
			else {
				return false;
			}
		} return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		int num=sc.nextInt();
		if(checkNumber(num)==true) {
			System.out.println(num+ " is an increasing number");
		}
		else {
			System.out.println(num+ " is not an increasing number");
		}
		sc.close();
	}

}
