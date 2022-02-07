import java.util.Scanner;

public class ReverseNullTerminatedString {
	
	public static void main(String args[]) {
		
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("The result is :"+ reverseString(s));	
	}
	
	public static String reverseString(String str) {
		
	    char[] chars = str.toCharArray();
	    int n = chars.length;
	    for(int i = 0; i<n/2;i++) {
	    	
	    	char tmp = chars[i];
	    	chars[i] = chars[n-1-i];
	    	chars [n-1-i] = tmp;
	    	
  }
		
	return new String(chars);
}

}
