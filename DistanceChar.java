package Practice;
import java.util.*;
public class DistanceChar {
	public int[] solution(String s, char c) {
		int[] answer = new int[s.length()];
		int p =1000;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)==c) {
				p=0;
				answer[i] =p;
			}
			if(s.charAt(i)!=c) {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for(int i = s.length()-1;i>=0;i--) {
			if(s.charAt(i)==c) p=0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		DistanceChar T = new DistanceChar();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		char c = kb.next().charAt(0);
		for(int x: T.solution(s,c)) {
			System.out.print(x+" ");
		}
	}

}
