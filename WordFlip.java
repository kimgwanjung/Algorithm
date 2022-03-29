package Practice;
import java.util.*;
public class WordFlip{
	public ArrayList<String> solution(int b, String[] s) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : s) {
			char[] a = x.toCharArray();
			int l = 0,rt =x.length()-1;
			while(l<rt) {
				char tmp = a[l];
				a[l] = a[rt];
				a[rt]=tmp;
				l++;
				rt--;
			}
			String tmp = String.valueOf(a);
			answer.add(tmp);
		}
		return answer;
	}
	public static void main(String[] args) {
		WordFlip T = new WordFlip();
		Scanner kb = new Scanner(System.in);
		int b = kb.nextInt();
		String[] s = new String[b];
		for(int i = 0; i<b; i++) {
			s[i]=kb.next();
		}
		for(String x : T.solution(b,s)) {
			System.out.println(x);
		}
	
		
	}
}
