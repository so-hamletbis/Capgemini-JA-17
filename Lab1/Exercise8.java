import java.util.Scanner;

public class Exercise8 {
	public static boolean checkNumber(int n) {
		if(n==0) {
			return false;
		}
		while(n!=1) {
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int num=sc.nextInt();
		if(checkNumber(num)==true) {
			System.out.println(num +" is a power of two");
		}
		else {
			System.out.println(num +" is not a power of two");
		}
		sc.close();
	}

}
