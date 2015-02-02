import java.awt.List;
import java.util.ArrayList;

public class InterfacePrint {
	static int rows = 0;
	static int tableWidth = 31;
	static ArrayList<String> numHistory = new ArrayList<String>();
	static ArrayList<String> stringConstructor = new ArrayList<String>();
	static int errCodes = 0;

	public static void printInterface() {
		System.out.print("\033[2J\033[1;1H");
		int counter = 0;
		int tableStart = 0;
		String[] errMsg = { "_Entered equal digits!_",
				"__Enter ONLY digits!___", "____Congratulations____",
				"__Enter_ONLY_4_digits!_", "__Cow:", "_<-_Bull" };

		boolean isFinished = false;
		/*
		 * for (int i = 0; i < Number.class..length; i++) {
		 * 
		 * }
		 */

		System.out.println(" ______________________________");
		System.out.println("|                              |");
		System.out.println("|         BULLS AND COWS       |");
		System.out.println("| Terminal Game By Team Munich |");
		System.out.println("|                              |");
		System.out.println("|      for help type -h        |");
		System.out.println("|______________________________|");
		System.out.println("|Number|__________Info_________|");
		System.out.println("|****__|___Bulls___|____Cows___|");
		System.out.print("|");
		if (rows == 0) {
			rows++;
			return;
		}
		numHistory.add(Number.numForRecord);
		if (Number.errCode != 0) {
			errCodes = Number.errCode;
		}
		if (BullsAndCows.errCode != 0) {
			errCodes = BullsAndCows.errCode;
		}
		if (errCodes == 0) {
			/*
			 * if (rows == 1) { stringConstructor.add(numHistory.get(rows - 1) +
			 * "__|_____" + Bulls.bulls + "_____|_____" + Cows.cows +
			 * "_____|\n|"); System.out.println(stringConstructor.get(rows -
			 * 1)); } else { tableStart = 0; }
			 */
			stringConstructor.add(numHistory.get(rows - 1) + "__|_____"
					+ BullsAndCows.bulls + "_____|_____" + BullsAndCows.cows
					+ "_____|\n|");
			for (int i = 0; i < rows; i++) {

				System.out.print(stringConstructor.get(i));
			}
		} else {
			if (errCodes < 5) {
				if (errCodes == 3) {
					stringConstructor.add("****__|" + errMsg[errCodes - 1]
							+ "|\n|");
					for (int i = 0; i < rows; i++) {
						System.out.print(stringConstructor.get(i));
					}
					System.exit(0);
				}
				stringConstructor
						.add("****__|" + errMsg[errCodes - 1] + "|\n|");
				for (int i = 0; i < rows; i++) {
					System.out.print(stringConstructor.get(i));
				}
			} else if (errCodes == 5) {

				stringConstructor
						.add("****__|" + errMsg[errCodes - 1]
								+ Cows.helpCows(errCodes) + "________________"
								+ "|\n|");
				for (int i = 0; i < rows; i++) {

					System.out.print(stringConstructor.get(i));
				}
			} else {
				stringConstructor.add("****__|" + errMsg[errCodes - 1]
						+ "_______________" + "|\n|");
				for (int i = 0; i < rows; i++) {

					System.out.print(stringConstructor.get(i));
				}
			}
			rows++;
			errCodes = 0;
			BullsAndCows.startGame();
		}
		rows++;
	}
}
