
public class Cows {
	public static int countCows(int[] guessNum, int[] compNum){
		int cows=0;
			for (int i = 0; i < compNum.length; i++) {
				for (int j = 0; j < guessNum.length; j++) {
					if (guessNum[j]==compNum[i] && i!=j){
						cows++;
					}
				}
			}
		return cows;
	}
}
