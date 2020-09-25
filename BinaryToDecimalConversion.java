
public class BinaryToDecimalConversion {
	public static void main(String args[]) {
		decimalToBinary(1008);
		System.out.println();
		System.out.println(binaryToDecimal("100100"));
	}
	
	public static int binaryToDecimal(String s) {
		int base = 1;
		int num = 0;
		for (int loop = s.length() - 1; loop >= 0; --loop, base *= 2) {
			if (s.charAt(loop) == '1')
				num += base;
		}
		return num;
	}
	
	public static void decimalToBinary(int i) {
		Integer b[] = new Integer[1024];
		int count = 0;
		
		while(i>0) {
			b[count++] = i % 2;
			i /= 2;
		}
		
		System.out.print("Binary String: ");
		for (int l = count - 1; l >= 0; --l)
			System.out.print(b[l] + " ");
	}
}
