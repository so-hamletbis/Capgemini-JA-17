import java.util.Scanner;
import java.util.Arrays;

public class Excercise4 {
	public static int[] modifyArray(int array[]) {
		int n = array.length;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			visited[i] = true;
		}
		int ct = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				for (int j = i+1; j < n; j++) {
					if (array[i] == array[j]) {
						visited[j] = false;
						ct += 1;
					}
				}
			}
		}
		int k = 0;
		int[] ans = new int[n-ct];
		for (int i = 0; i < visited.length; i++) {
			if (visited[i] == true) {
				ans[k] = array[i];
				k += 1;
			}
		}
		
		for (int i = 0; i < ans.length; i++) {
			for (int j = i+1; j < ans.length; j++) {
				if (ans[i] < ans[j]) {
					int x = ans[i];
					ans[i] = ans[j];
					ans[j] = x;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in array:");
		int n=sc.nextInt();
		System.out.println("Enter the elements:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(modifyArray(arr)));
		sc.close();
	}

}
