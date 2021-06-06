import java.util.Scanner;

public class Excercise5 {
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter:");
		int num=sc.nextInt();
		System.out.println("The sum divisible 3 or 5 is " +calculateSum(num));
		sc.close();
	}
}
