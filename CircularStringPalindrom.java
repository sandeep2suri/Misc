
public class CircularStringPalindrom {
	public static void main(String[] args) {
		System.out.println(way_one("aabaab"));
		System.out.println(way_one("12321"));
		System.out.println(way_one("23211"));
		System.out.println(way_one("123"));
	}

	public static boolean way_one(String s) {
		return is_circular_palindrom_recursion(s, 0);
	}

	public static boolean is_circular_palindrom_recursion(String s, Integer i) {
		String t = s.substring(i, s.length()) + s.substring(0, i);
		if (is_palindrom(t) == false) {
			if (i == (t.length() - 1))
				return false;

			return is_circular_palindrom_recursion(s, ++i);
		}
		return true;
	}

	public static boolean is_palindrom(String s) {
		char[] c = s.toCharArray();
		for (int l = 0; l < (s.length() / 2); ++l)
			if (c[l] != c[s.length() - 1 - l])
				return false;
		return true;
	}
}
