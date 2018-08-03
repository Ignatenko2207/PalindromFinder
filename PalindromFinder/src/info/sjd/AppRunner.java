package info.sjd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		int result = getMaximalPalndrom();
		
		logger.info("Maximal palindrom is " + result);
	}

	private static int getMaximalPalndrom() {
		List<Integer> palindroms = new ArrayList<>();
		
		for(int i = 1000; i < 10000; i++) {
			for(int j = 1000; j < 10000; j++) {
				int result = i*j;
				
				if(resultIsPalindrom(result)) {
					palindroms.add(result);
				}
			}			
		}
		
		return Collections.max(palindroms);
	}

	private static boolean resultIsPalindrom(int result) {

		
		return false;
	}
}
