
public class SpaceCountReplace {
	
	public static void main(String args[]) {
		
		
	}

	public static String replaceSpace(char[] str, int length) {
		
		int spaceCount = 0, newlength,i;
		for(i=0;i<length;i++) {
			if(str[i] == ' ')
              spaceCount++;
		}
		newlength = length + spaceCount*2;
		str[newlength]='\0';
		for (i = length-1;i>=0;i--) {
			
			if (str[i]== ' ') {
				
				str[newlength-1] = '0';
				str[newlength-2] = '2';
				str[newlength-3] = '%';
				newlength=newlength-3;
			
				
			}else {
				str[newlength-1] = str[i];
				newlength=newlength-1;
			}
		}
	return null;
		
		
	}
}
