import java.util.Scanner;



public class BullsAndCows {
	//creating a computer number
	static int[] compNumber=Number.createNumber();
	static boolean isGuessed= false;

	public static void main(String[] args) {
		//rules of the game
		System.out.println("This is Bulls and Cows game");
		System.out.println("az sam Stanimir");
		startGame();
	}
	public static void startGame(){
		Scanner scan=new Scanner(System.in);
		//menu: info -> provides rules 
		//		cow  -> returns you a number from computerNumber
		//		bull -> returns you a bull example **3*
		//		4345 -> entering a number -> continue the game
		while (!isGuessed){
			System.out.println("enter a num");
			String guessNum=scan.next();
			switch (guessNum) {
			case "info":
				getInfo();
				break;
			case "cow":
				Cows.helpCow(compNumber);
				break;
			case "bull":
				Bulls.helpBull(compNumber);
				break;
			default:
				engine(guessNum);
				break;
			}
		}
	}
	public static void engine(String guessNum){
		int[] guessNumber=Number.verifyNumber(guessNum);
		if (guessNumber == null) {
			return;
		}
		//printing secret number for tests
		for (int i : compNumber) {
			System.out.print(i);
		}
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
	private static void getInfo() {
		// Method with ifno about the game
		System.out.println("info");
	}
}
