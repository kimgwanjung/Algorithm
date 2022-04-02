package Practice;
import java.util.*;
public class StudentTall {
	public int solution(int n, int[] arr){
		int answer = 1; 
		int max = arr[0];
		for(int i=1; i<n;i++) {
			if(arr[i]>max) {
				answer++;
				max=arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		StudentTall T = new StudentTall();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr= new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = kb.nextInt();
		}
			System.out.print(T.solution(num, arr));

		
	}
	

}
