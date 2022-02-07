import java.util.Scanner;

public class UniqueStringCharacterUsingBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("The result is :"+ isUniqueChars(s));

	}
	
	public static boolean isUniqueChars(String str) {
		
		int checker = 0;
		for(int i = 0; i<str.length();i++) {
			int val = str.charAt(i)-'a';
			if((checker  & (1 << val)) > 0) {
				
				return false;
			}
			
			checker |=(1 << val);
		}

		
		return true;
		
		
	}

}
