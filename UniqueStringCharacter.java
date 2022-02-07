import java.util.Scanner;

public class UniqueStringCharacter {
	
	public static void main(String arg[]) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("The result is :"+ isUniqueChars2(s));
	}
	
	public static boolean isUniqueChars2(String str) {
		
		if(str.length() > 256) return false;
		
		boolean[] char_set=new boolean[256];
		
		for(int i=0;i<str.length();i++) {
			
			int val=str.charAt(i);
			if(char_set[val]) {
				
				return false;
			}
			char_set[val]=true;
		}

		
		return true;
		
		
	}

}
