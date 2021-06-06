import java.util.Scanner;
import java.util.Arrays;

public class Excercise2 {
	public static String[] sortStrings(String[] array) {
		Arrays.sort(array);
		return array;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of characters:");
		int n=sc.nextInt();
		System.out.println("Enter elements in array:");
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next();
		}
		String[] val = sortStrings(arr);
		for(String value : val) {
			System.out.println(value);
		}
		
		sc.close();
	}

}