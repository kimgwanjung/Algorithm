package Practice;
import java.util.*;
public class CharChange {
	public String solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()){ //for-each문으로 배열 탐색
			if(Character.isUpperCase(x)) answer +=Character.toLowerCase(x); //대문자-->소문자
			else answer += Character.toUpperCase(x); //소문자-->대문자
		}
		return answer;
		
	}
	public static void main(String[] args) { //입출력 메인
		CharChange T = new CharChange();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s)); 
		
	}

}
