package info.sjd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());

	public static void main(String[] args) {
		int result = getMaximalPalindrom();
		
		logger.info("Maximal palindrom is " + result);

//		logger.info(String.valueOf(resultIsPalindrom(1234568)));
//		logger.info(String.valueOf(resultIsPalindrom(1234321)));

	}

	public static int getMaximalPalindrom() {
		Set<Integer> palindroms = new HashSet<>();

		for (int i = 1000; i < 10000; i++) {
			for (int j = 1000; j < 10000; j++) {
				int result = i * j;

				if (resultIsPalindrom(result)) {
					palindroms.add(result);
				}
			}
		}

		return Collections.max(palindroms);
	}

	public static boolean resultIsPalindrom(int result) {

		String reverse = new StringBuilder(String.valueOf(result)).reverse().toString();
		return reverse.equals(String.valueOf(result));
	}
}
