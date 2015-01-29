import java.util.Random;


public class Number {
	public static int[] createNumber(){
		//creating array
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
}
