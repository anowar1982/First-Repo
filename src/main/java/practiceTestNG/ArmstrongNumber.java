package practiceTestNG;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int givennumber = 11;	// 153 is ArmstrongNumber
		int reminder = 0;
		int formation =0;
		int sum = 0;
		int starNumber = givennumber;
		
		while(givennumber>0){
			reminder = givennumber%10;
			//formation = reminder*reminder*reminder;
			//sum = sum+formation;
			sum = sum+(reminder*reminder*reminder);
			givennumber=givennumber/10;
		}

		if (sum == starNumber) {
			System.out.println("given number is ArmstrongNumber");
		} else {
			System.out.println("no no no. given  number is not ArmstrongNumber");
		}	}

}
