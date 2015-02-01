import java.util.Random;
import java.util.Scanner;


public class Number {
	public static int[] createNumber(){
		//creating array 10,10,10,10 because digits are from 0-9
		int[] numArr= {10,10,10,10};
		Random rnd = new Random();
		Integer countOfNumbersInArray = 0;
		//pushing random number in the array
		while (countOfNumbersInArray<4){
			Integer num=rnd.nextInt(9);
			//checking first number not to be 0 like 0942
			if (num.equals(0) && countOfNumbersInArray.equals(0)){
				continue;
			}else{
				//checking if the number was repeated (numbers in created numbers are never same 4343- is wrong)
				boolean reapetedNum= false;
				for (int i = 0; i < countOfNumbersInArray+1; i++) {
					if (num.equals(numArr[i])){
						reapetedNum=true;
						break;
					}
				}
				//adding num in the array
				if(!reapetedNum){
					numArr[countOfNumbersInArray]=num;
					//increasing the count of created numbers
					countOfNumbersInArray++;
				}
			}
		}
		return numArr;
	}

	public static int[] verifyNumber(String numStr){
		int[] numArr = {10,10,10,10};

		// verifying the input

		// checking if the number is smaller that 4 digits
		if (numStr.length()<4 || numStr.length()>=5){
			if(!BullsAndCows.isGuessed){
			System.out.println("Error! Enter 4 digits, and all different!");
			//ask again the number
//			BullsAndCows.startGame();
			return null;
			}
		}else{
			// trying to parse string to int
			try {
				int num= Integer.parseInt(numStr);
			} catch (Exception e) {
				// !BullsAndCows.isGuessed checking if the game has finished
				if(!BullsAndCows.isGuessed){
					System.out.println("Error! Enter ONLY digits");
					//ask again the number
//					BullsAndCows.startGame();
					return null;
				}
			}
		}
		//parsing string to int array
		String[] strArr=numStr.split("");
		int countOfParsedNumbers=0;
		for (int i = 0; i < strArr.length; i++) {
			Integer numToParse=Integer.parseInt(strArr[i]);
			boolean isSame=false;
			//verifying that guess number doesn't consist of same digits (like 2323 -wrong num)
			for (int j = 0; j < countOfParsedNumbers+1; j++) {
				if (numToParse.equals(numArr[j])){
					isSame=true;
					break;
				}
			}
			if(!isSame){
				numArr[i]=numToParse;
				countOfParsedNumbers++;
			}else{
				System.out.println("Error! Digits should be different!");
				//ask again number
//				BullsAndCows.startGame();
				return null;
			}
		}

		return numArr;
	}
}
