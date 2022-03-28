package Practice;
import java.util.*;
public class FindLongString {
	public String solution(String s) {
		String answer = "";
		int m = 0; //문자열의 길이중 가장 짧은 값으로 초기화
		String[] sp = s.split(" "); //split으로 나누어 주기
		for(String x : sp) {
			int len = x.length(); 
			if(len>m) { //x의 길이가 0보다 크다면
				m = len; //최대 길이 초기화
				answer = x;//최대 길이인 값 초기화
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		FindLongString K = new FindLongString();
		Scanner kb = new Scanner(System.in);
		String s = kb.nextLine();
		System.out.print(K.solution(s));
	}

}
