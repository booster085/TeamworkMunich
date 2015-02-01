
public class Cows {
	public static int countCows(int[] guessNum, int[] compNum){
		int cows=0;
		//counting cows - same digits but different place 1234 and 4321 => 4 cows
			for (int i = 0; i < compNum.length; i++) {
				for (int j = 0; j < guessNum.length; j++) {
					if (guessNum[j]==compNum[i] && i!=j){
						cows++;
					}
				}
			}
		return cows;
	}
	//method that returns a digit from a secretNumber(computerNumber) example: 4
	public static void helpCow(int[] compNumber){
		
		System.out.println("cow");
	}
}
