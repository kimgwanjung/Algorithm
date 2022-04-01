package Practice;
import java.util.*;
public class PalindromeAlphabet {
	public String solution(String s) {
		String answer = "YES";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		int len = s.length();
		for(int i = 0; i < len/2;i++) {
			if(s.charAt(i)!=s.charAt(len-1-i)) {
				answer ="NO";
			}
		}
		return answer;
		
	}
	public static void main(String[] args) {
		PalindromeAlphabet T = new PalindromeAlphabet();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.print(T.solution(s));
	}

}
