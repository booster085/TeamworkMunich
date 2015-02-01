import java.util.Random;
import java.util.Scanner;

public class Number {
	public static String numForRecord = ""; // Stan: This is for printing the
	static int errCode = 0; // number in interface
	static int[] numArr = new int[4];
	
	public static int[] createNumber() {
		// creating array 10,10,10,10 because digits are from 0-9
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = 10;
		}
		Random rnd = new Random();
		int countOfNumbersInArray = 0;
		// pushing random number in the array
		while (countOfNumbersInArray < 4) {
			int num = rnd.nextInt(9);
			// checking first number not to be 0 like 0942
			if (num == 0 && countOfNumbersInArray == 0) {
				continue;
			} else {
				// checking if the number was repeated (numbers in created
				// numbers are never same 4343- is wrong)
				boolean reapetedNum = false;
				for (int i = 0; i < countOfNumbersInArray + 1; i++) {
					if (num == numArr[i]) {
						reapetedNum = true;
						break;
					}
				}
				// adding num in the array
				if (!reapetedNum) {
					numArr[countOfNumbersInArray] = num;
					// increasing the count of created numbers
					countOfNumbersInArray++;
				}
			}
		}
		return numArr;
	}

	public static int[] verifyNumber(String numStr) {
		errCode = 0; // Restarting the errCode
		int[] numArr = { 10, 10, 10, 10 };
		// verifying the input
		// checking if the number is smaller that 4 digits
		switch (numStr) {
		case "-cows":
			errCode = 5;
			InterfacePrint.printInterface();
			break;

		default:
			break;
		}
			
		
		if (numStr.length() != 4) { // Stan: Change to != instead of < 4 || >= 5
			if (!BullsAndCows.isGuessed) {
				errCode = 4;// Stan: I changed the statement
				// ask again the number
				InterfacePrint.printInterface();
			}
		} else {
			// trying to parse string to int
			try {
				int num = Integer.parseInt(numStr);
			} catch (Exception e) {
				// !BullsAndCows.isGuessed checking if the game has finished
				if (!BullsAndCows.isGuessed) {
					errCode = 2;
					// ask again the number
					InterfacePrint.printInterface();
				}
			}
		}
		// parsing string to int array
		// String[] strArr = numStr.split(""); Removing change of the string to
		// array
		int countOfParsedNumbers = 0;
		for (int i = 0; i < numStr.length(); i++) { // Stan: Change the strArr
													// to numStr
			int numToParse = Integer.parseInt(String.valueOf(numStr.charAt(i))); // Stan:
																					// Change
																					// the
																					// strArr
																					// to
																					// numStr
			boolean isSame = false;
			// verifying that guess number doesn't consist of same digits (like
			// 2323 -wrong num)
			for (int j = 0; j < countOfParsedNumbers + 1; j++) {
				if (numToParse == numArr[j]) {
					isSame = true;
					break;
				}
			}
			if (!isSame) {
				numArr[i] = numToParse;
				countOfParsedNumbers++;
			} else {
				errCode = 1;// Stan:
							// Change
							// the
							// statement
				// ask again number
				InterfacePrint.printInterface();
			}
		}
		numForRecord = "";
		for (int i = 0; i < numArr.length; i++) {
			numForRecord += numArr[i];
		}

		return numArr;
	}
}
