package Practice;
import java.util.*;
public class FIbonacci {
	public int[] solution(int n) {
		int answer[] = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i =2; i<n;i++) {
			answer[i] = answer[i-1]+ answer[i-2];
		}
		return answer;
	}
	public static void main(String[] args) {
		FIbonacci T = new FIbonacci();
		Scanner kb = new Scanner(System.in);
		int k = kb.nextInt();
		for(int x : T.solution(k)) {
			System.out.print(x + " ");
		}
	}

}
