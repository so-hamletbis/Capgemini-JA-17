import java.util.*;

public class Excercise3 {
	public static int[] getSorted(int array[]) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(array[i]));
			s.reverse();
			array[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(array);
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int newarr[]= getSorted(arr);
		System.out.println("The resultant array:");
		for(int i=0; i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
		sc.close();
	}

}
