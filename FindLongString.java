package Practice;
import java.util.*;
public class FindLongString {
	public String solution(String s) {
		String answer = "";
		int m = 0; //���ڿ��� ������ ���� ª�� ������ �ʱ�ȭ
		String[] sp = s.split(" "); //split���� ������ �ֱ�
		for(String x : sp) {
			int len = x.length(); 
			if(len>m) { //x�� ���̰� 0���� ũ�ٸ�
				m = len; //�ִ� ���� �ʱ�ȭ
				answer = x;//�ִ� ������ �� �ʱ�ȭ
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
