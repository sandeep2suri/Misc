import java.util.Arrays;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		System.out.println(removeDuplicate("geeksforgeeks"));
	}
	
	public static char[] removeDuplicate(String str) {
		char cArr[] = str.toCharArray();
		int counter=0;
		int length=0;
		int l=0;
		for (;l<cArr.length;++l) {
			int bit = cArr[l] - 'a';
			// check if corresponding counter bit is set
			if (((counter >> bit) & 1) == 0) {
				// if bit is not set, set that bit
				counter |= (1 << bit);
				cArr[length++] = cArr[l];
			}
		}
		
		return Arrays.copyOfRange(cArr, 0, length);
	}
}
