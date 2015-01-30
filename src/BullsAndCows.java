import java.util.Scanner;



public class BullsAndCows {

	public static void main(String[] args) {
		startGame();
	}
	public static void startGame(){
		int[] compNumber=Number.createNumber();
		Scanner scan=new Scanner(System.in);
		String guessNum=scan.next();
		int[] guessNumber=Number.verifyNumber(guessNum);
		System.out.println(Cows.countCows(guessNumber, compNumber));
		
		for (int i : guessNumber) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : compNumber) {
			System.out.print(i);
		}
	}
}
