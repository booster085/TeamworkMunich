import java.awt.List;
import java.util.ArrayList;

public class InterfacePrint {
	static int rows = 0;
	static int tableWidth = 31;
	static ArrayList<String> numHistory = new ArrayList<String>();
	static ArrayList<String> stringConstructor = new ArrayList<String>();
	static int errCodes = 0;

	public static void printInterface() {
	    try
	    {
	        String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {	
	        	System.out.print("\033[2J\033[1;1H");
	        }
	    }
	    catch (Exception exception)
	    {
	    	System.out.println("Error. Use Ctrl + C to quit.");
	    }
		int counter = 0;
		int tableStart = 0;
		String[] errMsg = { "_Entered equal digits!_",
							"__Enter ONLY digits!___",
							"____Congratulations____",
							"__Enter_ONLY_4_digits!_",
							"__Cow:",
							"_<-_Bull" };
		int[] bullIndex = { -1, -1, -1, -1 };
		boolean isFinished = false;

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
			stringConstructor.add(numHistory.get(rows - 1)
								+ "__|_____"
								+ BullsAndCows.bulls
								+ "_____|_____"
								+ BullsAndCows.cows
								+ "_____|\n|");
			for (int i = 0; i < rows; i++) {
				System.out.print(stringConstructor.get(i));
			}
		} else {
			if (errCodes < 5) {
				if (errCodes == 3) {
					stringConstructor.add("****__|"
										+ errMsg[errCodes - 1]
										+ "|\n|");
					for (int i = 0; i < rows; i++) {
						System.out.print(stringConstructor.get(i));
					}
					rows++;
					InterfacePrint.endInterface();
				}
				stringConstructor.add("****__|"
									+ errMsg[errCodes - 1]
									+ "|\n|");
				for (int i = 0; i < rows; i++) {
					System.out.print(stringConstructor.get(i));
				}
			} else if (errCodes == 5) {
				stringConstructor.add("****__|"
									+ errMsg[errCodes - 1]
									+ Cows.helpCows(errCodes)
									+ "________________"
									+ "|\n|");
				for (int i = 0; i < rows; i++) {
					System.out.print(stringConstructor.get(i));
				}
			} else {
				String bullStringPossition = "";
				bullIndex[Bulls.helpBulls()] = Bulls.bull;
				for (int i = 0; i < bullIndex.length; i++) {
					if (bullIndex[i] == -1) {
						bullStringPossition += "*";
					} else {
						bullStringPossition += bullIndex[i];
					}
				}
				stringConstructor.add(bullStringPossition
									+ "__|"
									+ errMsg[errCodes - 1] 
									+ "_______________"
									+ "|\n|");
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

	public static void endInterface() {
	
	    System.out.print("\033[2J\033[1;1H");

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
		for (int i = 0; i < rows - 1; i++) {
			System.out.print(stringConstructor.get(i));
		}
		System.out.println("______________________________|");
		System.out.println("|____________GAME OVER_________|");
		System.out.println("|______________________________|");
		System.exit(0);
	}
}