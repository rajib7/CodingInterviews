import java.util.Scanner;

public class ReplaceWithCountUsingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("The result is :"+ compressAlternate(s));


	}
  public static String compressAlternate(String str) {
	  
	  int size = countCompression(str);
	  if(size >=str.length()) {
		  
		  return str;
	  }
	  
	  char[] array = new char[size];
	  int index = 0;
	  char last = str.charAt(0);
	  int count = 1;
	  for(int i = 1; i <str.length(); i++) {
		  
		  if(str.charAt(i) == last) {
			  count++;
		  }else {
			  index=setChar(array, last, index, count);
			  last=str.charAt(i);
			  count=1;
		  }
	  }
	  index = setChar(array, last, index,count);
	  return String.valueOf(array);
	  
  }

	private static int countCompression(String str) {
		// TODO Auto-generated method stub
		
		if(str==null || str.isEmpty())
		return 0;
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for(int i = 1; i< str.length();i++) {
			
			if(str.charAt(i)==last) {
				
				count++;
			}else {
				
				last = str.charAt(i);
				size+=1+String.valueOf(count).length();
				count=1;
			}
		}
		size +=1+String.valueOf(count).length();
		return size;
	}
private static int setChar(char[] array, char c, int index, int count) {
	// TODO Auto-generated method stub
	
	array[index]=c;
	index++;
	char[] cnt = String.valueOf(count).toCharArray();
	for(char x : cnt) {
		
		array[index] = x;
		index++;
	}
	
	return index;
	}
}
