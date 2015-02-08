import java.util.Scanner;

public class BullsAndCows {
	// creating a computer number
	static int[] compNumber = Number.createNumber();
	static boolean isGuessed = false;
	static int isEnd = 0;
	static int errCode = 0;
	static int cows = 0;
	static int bulls = 0;

	public static void main(String[] args) {
		// rules of the game
		// System.out.println("This is Bulls and Cows game"); Stan: Adding a new
		// interface
		// interface for the console game.
		Intro.printIntro();
		InfoPage.printInfo();
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
			InterfacePrint.printInterface();
			startGame(); // Stan:Removeing the starting of the game. It will
			// be started from interface
	}

	public static void startGame() {

		Scanner scan = new Scanner(System.in);

		while (!isGuessed) {
			// 1System.out.println("enter a num"); Stan: The number should be
			// below the stars
			String guessNum = scan.next();
			/*
			 * switch (guessNum) { //That switch case will be in interface file
			 * case "-h": getInfo(); startGame(); break; case "cow":
			 * Cows.helpCow(compNumber); startGame(); break; case "bull":
			 * Bulls.helpBull(compNumber); startGame(); break; default: break; }
			 */
			int[] guessNumber = Number.verifyNumber(guessNum);
			// printing secret number for tests
			// for (int i : compNumber) {
			// System.out.print(i);
			// }
			// counting Bulls and Cows

			cows = Cows.countCows(guessNumber, compNumber);
			bulls = Bulls.countBulls(guessNumber, compNumber);
			// printing how many are bulls and cows
			// System.out.printf("Bulls:%d Cows:%d", bulls, cows); //Stan: This
			// is printed in interfaNumber.createNumber();ce
			InterfacePrint.printInterface();
			// new line
			// System.out.println(); Stan: New lines should be handled by
			// interface
			// condition to get out of while
			if (bulls == 4) {
				isGuessed = true;
				errCode = 3;
				InterfacePrint.printInterface();
			}
		}
	}
}
