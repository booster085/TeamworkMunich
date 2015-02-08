import java.util.Arrays;

public class InfoPage {
	public static void printInfo() {
		
	    System.out.print("\033[2J\033[1;1H");

		System.out.println(" ______________________________");
		System.out.println("|                              |");
		System.out.println("|           Info page          |");
		System.out.println("|                              |");
		System.out.println("| The Bulls and Cows game is a |");
		System.out.println("|game of guesing the 4 digits  |");
		System.out.println("|of a hidden number. You should|");
		System.out.println("|enter a 4 digit positive      |");
		System.out.println("|number without any duplucates.|");
		System.out.println("| You may type -b to reveal a  |");
		System.out.println("| bull digit and its unique    |");
		System.out.println("|position. Also type -c reveal |");
		System.out.println("|a cow digit.  Type -h for help|");
		System.out.println("|and -q to quit the game.      |");
		System.out.println("|______________________________|");

		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
