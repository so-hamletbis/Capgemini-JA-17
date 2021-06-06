import java.util.Scanner;

public class SumOfCubes {
	public static int method(int n) {
		int sum=0;
		while(n>0){
			int s=n%10;
			int cube=s*s*s;
			sum= sum+cube;
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Sum of cube of digits is "+ method(num));
		sc.close();
	}
}