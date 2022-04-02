package Practice;
import java.util.*;
class BigNum {
	public ArrayList<Integer> solution(int num, int[] n) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(n[0]);
		for(int i=1; i<num;i++) {
			if(n[i]>n[i-1]) answer.add(n[i]);
		}
		return answer;
	}
	public static void main(String[] args) {
		BigNum T = new BigNum();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] n = new int[num];
		for(int i = 0; i<num;i++) {
			n[i] = kb.nextInt();
		}
		for(int x: T.solution(num,n)) {
			System.out.print(x+" ");
		}
	}
}
