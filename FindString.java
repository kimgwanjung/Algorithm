package Algorithm;
import java.util.*;
public class FindString {
	public int solution(String s , char c) {
		int answer = 0; //0으로 초기화
		c = Character.toUpperCase(c); //모두 대문자로 바꿈
		s = s.toUpperCase(); //모두 대문자로 바꿈
		for(int i =0; i < s.length();i++) {
			if(s.charAt(i) == c) { //s의 문자가 c와 같을경우 answer 증가
				answer++;
			}
		}
		return answer;
		
	}
	
	public static void main(String args[]) { //입출력 메인
		
		Scanner kb = new Scanner(System.in); 
		FindString T = new FindString();
		
		String s = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(s,c));
	}

}
