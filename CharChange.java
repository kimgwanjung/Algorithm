package Practice;
import java.util.*;
public class CharChange {
	public String solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()){ //for-each������ �迭 Ž��
			if(Character.isUpperCase(x)) answer +=Character.toLowerCase(x); //�빮��-->�ҹ���
			else answer += Character.toUpperCase(x); //�ҹ���-->�빮��
		}
		return answer;
		
	}
	public static void main(String[] args) { //����� ����
		CharChange T = new CharChange();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s)); 
		
	}

}
