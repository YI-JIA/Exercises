package org.coding.wap;

public class CommonUtils {

	public static String fetchMaxLengthOfAscendingNumbers(String value) {
		String maxLengthAscendingNumbers = "";
		StringBuilder currentAscendingNumbers = new StringBuilder();
		char pc = 0;// previous character
		for (int i = 0; i < value.length(); i++) {
			char cc = value.charAt(i);// current character
			if (i > 0) {
				pc = value.charAt(i - 1);
			}
			if (cc < pc) {
				maxLengthAscendingNumbers = maxLengthString(currentAscendingNumbers, maxLengthAscendingNumbers);
			}
			currentAscendingNumbers.append(cc);
		}
		maxLengthAscendingNumbers = maxLengthString(currentAscendingNumbers, maxLengthAscendingNumbers);
		return maxLengthAscendingNumbers;
	}

	public static String maxLengthString(StringBuilder currentString, String maxLengthString) {
		if (currentString.length() > maxLengthString.length()) {
			maxLengthString = currentString.toString();
		}
		currentString.delete(0, currentString.length());
		return maxLengthString;
	}
}
