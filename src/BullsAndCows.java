import java.util.Scanner;



public class BullsAndCows {
	//creating a computer number
	static int[] compNumber=Number.createNumber();

	public static void main(String[] args) {
		//rules of the game
		System.out.println("This is Bulls and Cows game");
		startGame();
	}
	public static void startGame(){
		Scanner scan=new Scanner(System.in);
		boolean isGuessed= false;
		while (!isGuessed){
			System.out.println("enter a num");
			String guessNum=scan.next();
			int[] guessNumber=Number.verifyNumber(guessNum);
			//printing secret number for tests
//			for (int i : compNumber) {
//				System.out.print(i);
//			}
			//counting Bulls and Cows
			int cows= Cows.countCows(guessNumber, compNumber);
			int bulls= Bulls.countBulls(guessNumber, compNumber);
			//printing how many are bulls and cows
			System.out.printf("Bulls:%d Cows:%d", bulls, cows);
			//new line
			System.out.println();
			//condition to get out of while
			if (bulls==4){
				isGuessed=true;
				System.out.println("Congratulations");
			}
		}
	}
}
