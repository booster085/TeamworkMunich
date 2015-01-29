import java.util.Scanner;



public class BullsAndCows {

	public static void main(String[] args) {
		startGame();
	}
	public static void startGame(){
		int[] num=Number.createNumber();
		Scanner scan=new Scanner(System.in);
		String guessNum=scan.next();
		int[] guessNumber=Number.verifyNumber(guessNum);
		for (int i : guessNumber) {
			System.out.println(i);
		}
	}
}

