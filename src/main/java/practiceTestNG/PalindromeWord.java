package practiceTestNG;

public class PalindromeWord {
	public static void main(String[] args) {
		String word = "kana#ka";
		word = word.toLowerCase();
		word = word.replaceAll("[^a-z]", "");
		char[]chars = word.toCharArray();
		StringBuffer stb = new StringBuffer();
		for (int i=chars.length-1; i>=0; i--){
			stb.append(chars[i]);
		}
		if (word.equalsIgnoreCase(stb.toString())) {
			System.out.println("given word is pallindrome");
		} else {
			System.out.println("no no no. given  number is not pallindrome");
		}	}

}
