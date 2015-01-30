
public class Bulls {

	public static int countBulls(int[] guessNum, int[] compNum){
		int bulls=0;
		for (int i = 0; i < compNum.length; i++) {
			if (guessNum[i]==compNum[i]){
				bulls++;
			}
		}
		return bulls;
	}
}
