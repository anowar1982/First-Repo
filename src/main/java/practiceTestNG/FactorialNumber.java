package practiceTestNG;

public class FactorialNumber {
	public static void main(String[] args) {
		int givennumber = 4;
		int total = 0;
		boolean flag = false;
		while (givennumber > 0) {
			total = total + 1;
			int result = 0;

			for (int i = 1; i <= givennumber; i++) {
				total = total * i;
				if (i == givennumber) {
					flag = true;				
				}
			}
			if (flag) {
				break;
			}
		}
		System.out.println(total);
	}

}
