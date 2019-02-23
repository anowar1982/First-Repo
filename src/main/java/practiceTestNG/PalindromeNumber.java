package practiceTestNG;

public class PalindromeNumber {

	public static void main(String[] args) {
		int givenNumber = 5156;
		int r = 0;
		int sum = 0;
		int t = givenNumber;

		while (givenNumber > 0) {
			r = givenNumber % 10;
			sum = (sum * 10) + r;
			givenNumber = givenNumber / 10;
		}

		if (t == sum) {
			System.out.println("given number is pallindrome");
		} else {
			System.out.println("no no no. given  number is not pallindrome");
		}

	}

}
