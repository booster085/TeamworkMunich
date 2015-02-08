import java.util.Random;

public class Cows {
	



	public static int countCows(int[] guessNum, int[] compNum) {

		// counting cows - same digits but different place 1234 and 4321 => 4
		// cows
		int cows = 0;
		for (int i = 0; i < compNum.length; i++) {
			for (int j = 0; j < guessNum.length; j++) {
				if (guessNum[j] == compNum[i] && i != j) {
					cows++;
				}
			}
		}
		return cows;
	}

	public static int helpCows(int cow) {
		int randomCow = 0;
		Random rnd = new Random();
		randomCow = Number.numArr[rnd.nextInt(4)];
		return randomCow;
	}
}
