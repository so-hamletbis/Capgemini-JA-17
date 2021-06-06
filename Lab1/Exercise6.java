import java.util.Scanner;

public class Exercise6 {
	public static int calculateDifference(int n) {
		int sum=0,sum1=0,sum2=0;
		for(int i=0;i<=n;i++) {
			sum1+=(i*i);
		}
		for(int i=0;i<=n;i++) {
			sum2+=i;
		}
		sum=sum1-(sum2*sum2);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int num= sc.nextInt();
		System.out.println("The difference between the sum of the squares of the first n natural numbers and the square of their sum  is "+ calculateDifference(num));
		sc.close();
	}
}