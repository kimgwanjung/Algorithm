package Algorithm;
import java.util.*;
public class FindString {
	public int solution(String s , char c) {
		int answer = 0; //0���� �ʱ�ȭ
		c = Character.toUpperCase(c); //��� �빮�ڷ� �ٲ�
		s = s.toUpperCase(); //��� �빮�ڷ� �ٲ�
		for(int i =0; i < s.length();i++) {
			if(s.charAt(i) == c) { //s�� ���ڰ� c�� ������� answer ����
				answer++;
			}
		}
		return answer;
		
	}
	
	public static void main(String args[]) { //����� ����
		
		Scanner kb = new Scanner(System.in); 
		FindString T = new FindString();
		
		String s = kb.next();
		char c = kb.next().charAt(0);
		System.out.print(T.solution(s,c));
	}

}
