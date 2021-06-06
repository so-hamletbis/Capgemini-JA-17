import java.util.Scanner;

public class Excercise3 {
	public static boolean vowels(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static String alterString(String str) {
		char ch[]= str.toCharArray();
		int len= ch.length;
		
		for(int i=0; i<len; i++) {
			if(vowels(ch[i])) {
				continue;
			}
			else if(ch[i]=='z' || ch[i]=='Z') {
				ch[i]='a'; 
			}
			else {
				ch[i]=(char)(ch[i]+1);
			}
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		
		System.out.println("New String: "+ alterString(s));
		sc.close();

	}

}
