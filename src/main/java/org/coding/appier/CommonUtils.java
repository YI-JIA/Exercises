package org.coding.appier;

public class CommonUtils {

	public static void kthPower(int perfectPower, int base) {
		int quotient = perfectPower;
		int power = 0;
		while ((quotient = quotientForKthPower(quotient, base)) > 0) {
			power++;
		}
		if (quotient == -1) {
			System.out.println(String.format("%d is not a perfect kth power", perfectPower, base, quotient));
		} else {
			System.out.println(String.format("%d is %d power of %d", perfectPower, power, base));
		}
	}

	public static int quotientForKthPower(int value, int base) {
		if (value == 1)
			return 0;
		if (value % base == 0)
			return value / base;
		return -1;
	}

}
