import java.util.Arrays;

public class InfoPage {
	public static void printInfo() {

		System.out.print("\033[2J\033[1;1H");
		// System.out.print("\033[2J");

		System.out.println(" ______________________________");
		System.out.println("|                              |");
		System.out.println("|           Info page          |");
		System.out.println("|                              |");
		System.out.println("| The Bulls and Cows game is a |");
		System.out.println("|game of guesing the 4 digits  |");
		System.out.println("|of a hidden number. You should|");
		System.out.println("|enter a 4 digit positive      |");
		System.out.println("|number without any duplucated |");
		System.out.println("|digits. You can type -bull to |");
		System.out.println("|to reveal a bull digit and    |");
		System.out.println("|position. Also type -cows to  |");
		System.out.println("|to reveal a cow digit.        |");
		System.out.println("|______________________________|");

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
