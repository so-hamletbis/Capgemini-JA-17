import java.util.Scanner;
import java.util.Arrays;

public class Excercise1 {
	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("The second smallest element is " + getSecondSmallest(array));
		sc.close();
	}

}
