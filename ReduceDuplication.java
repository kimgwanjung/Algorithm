package Practice;
import java.util.*;
public class ReduceDuplication {
	public String solution(String s) {
		String answer = "";
		for(int i = 0 ; i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==i) answer += s.charAt(i);
		}
		return answer;
	}
	public static void main(String[] args) {
		ReduceDuplication T = new ReduceDuplication();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s));
	}

}
