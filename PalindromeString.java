package Practice;
import java.util.*;
public class PalindromeString {
	public String solution(String s) {
		String answer ="YES";
		String str = s.toUpperCase();
		int len = str.length();
		for(int i=0; i< len/2;i++) {
			if(str.charAt(i)!=str.charAt(len-1-i)) {
				answer = "NO";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		PalindromeString T = new PalindromeString();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s));
	}

}
