package Practice;
import java.util.*;
public class PrimeNumber {
	public int solution(int n){
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2;i<n+1;i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n;j=j+i) {
					ch[j]=1;
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		PrimeNumber T = new PrimeNumber();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		System.out.print(T.solution(n));
	}
}
