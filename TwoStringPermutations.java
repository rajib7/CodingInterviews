import java.util.Scanner;

public class TwoStringPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the String 1");
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		
		System.out.println("Enter the String 2");
		
		Scanner sc2 = new Scanner(System.in);
		String s2 = sc2.nextLine();
		System.out.println("The result is :"+ permutation(s1,s2));	
	}

	
public static boolean permutation(String s1, String s2) {
	
	if(s1.length() != s2.length()) {
		
		return false;
	}
	
	int[] letters = new int[256];
	char[] s1_array = s1.toCharArray();
	for(char c : s1_array) {
		letters[c]++;
	}
	 
	for (int i= 0; i<s2.length();i++) {
		
		int c = (int) s2.charAt(i);
		if (--letters[c] < 0) {
			
			return false;
		}
	}
	
	
	return true;
	
	
}

}
