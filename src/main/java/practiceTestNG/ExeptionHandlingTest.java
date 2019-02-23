package practiceTestNG;

public class ExeptionHandlingTest {
	// try catch block
	// use Throwable in the catch block
	// throws exception (i.e  ArithmeticException)

	public static void main(String[] args) {
		boolean flag = false;
		int j = 0;
		do{
		try {
			int i = 9 / 0;
			System.out.println(i);
		} catch (Throwable e) {	//Exception
			e.printStackTrace();
			System.out.println("I am printed");
			flag = true;
		}
		String st = "anowar";
		st.toUpperCase();
		System.out.println(st);
		System.out.println(flag);
		j++;
		} while (j<5);

	}

}
