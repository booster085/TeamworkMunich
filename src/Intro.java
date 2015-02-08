import java.io.IOException;

public class Intro {
	public static void printIntro() {
		String gameText = "BULLS AND COWS";
		String teamText = "Created by Team Munich";
		String memberText = "Kiril, Martin, Stanimir";
		int animeSpeed = 100;

	    System.out.print("\033[2J\033[1;1H");

		System.out.println(" ____________________________\n");
		for (int i = 0; i < gameText.length(); i++) {

			System.out.printf("%2s", gameText.charAt(i));
			if (i == gameText.length() - 1) {
				System.out.println("\n");
			}
			try {
				Thread.sleep(animeSpeed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("  ");
		for (int i = 0; i < teamText.length(); i++) {

			System.out.printf("%s", teamText.charAt(i));
			if (i == teamText.length() - 1) {
				System.out.println("\n");
			}
			try {
				Thread.sleep(animeSpeed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("  ");
		for (int i = 0; i < memberText.length(); i++) {

			System.out.printf("%s", memberText.charAt(i));
			if (i == memberText.length() - 1) {
				System.out.println();
			}
			try {
				Thread.sleep(animeSpeed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" ____________________________");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
