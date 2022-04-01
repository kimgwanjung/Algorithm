package Practice;
import java.util.*;
public class FindNum {
	public int solution(String s) {
		int answer=0;
		s = s.replaceAll("[^0-9]", "");
		//System.out.print(s);
		answer = Integer.parseInt(s);
		return answer;
	}
	public static void main(String[] args) {
		FindNum T = new FindNum();
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		System.out.print(T.solution(s));
	}

}
