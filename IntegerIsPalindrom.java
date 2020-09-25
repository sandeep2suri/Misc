
public class IntegerIsPalindrom {
	public static void main(String[] args) {
		try {
			way_two(12321);
			System.out.println("Yes");
		} catch (Exception e) {e.printStackTrace();}
	}
	
	public static boolean isPal(int i) {
		// count number of digits;
		int d = i;
		int c = 0;
		int div = 1;
		while(d>0) {
			d/=10;
			++c;
			div *= 10;
		}
		int mod = 10;
		while (c>0) {
			if ((i/div) != (i%mod))
				return false;
			mod *= 10;
			div /= 10;
			c -= 2;
		}
		return true;
	}

	public static void way_one(Integer i) {
		int div = 1;
		int mod = 10;
		int l = 0;
		
		if ((i > 10) || (i < -10)) return;

		// calculate number of digits
		while((i/div) > 0) {
			div *= 10;
			++l;
		}
		
		for (;l>0;l-=2) {
			if ((i / div) != (i % mod))
				throw new RuntimeException("No");
			div /= 10;
			mod *= 10;
		}
	}
	
	public static boolean way_two(Integer i) {
		// treat single digit number as palindrom
		if (!((i > 10) || (i < -10)))
			return true;
		
		return is_pal_util(i, i) > 0 ? true : false;
		
	}
	
	public static Integer is_pal_util(Integer num1, Integer num2) {
		if (num1 == 0)
			return num2;
		
		num2 = is_pal_util(num1/10, num2);
		
		if ((num1 % 10) == (num2 % 10))
			return num2/10;
		else
			throw new RuntimeException("No");
	}
}
