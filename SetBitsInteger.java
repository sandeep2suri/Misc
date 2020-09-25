
public class SetBitsInteger {

	public static void main(String[] args) {
		int i = 32;
		
		System.out.println("Number of set bits: " + countBits(i));
	}
	
	public static int countBits(int i) {
		int numBits = 0;
		for (; i>0; i= i >> 1)
			numBits += i & 1;
		return numBits;
	}
	
	public static int countBitsEfficient(int i) {
		int numBits = 0;
		for (; i>0; i= (i - 1) & 1)
			++numBits;
		return numBits;
	}
}
