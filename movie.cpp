#include <stdio.h>
#include <stdlib.h>
#include <memory.h> 
#include<string.h>
#include <algorithm>
#include <time.h>

using namespace std;
int n; //영화 갯수 전역함수로 설정
struct movie { // 영화 스케쥴 구조체
	int a; // 촬영 시작
	int b; // 촬영 마지막날
	int p; // 단가
};

movie m[50001];
int dp[50001];

int cmp(movie m1, movie m2) {
	// 시작 시간을 기준으로 정렬한다
	if (m1.a < m2.a) return 1;
	else if (m1.a == m2.a) return m1.b < m2.b;// 같은날 시작하면 일찍끝나는 것이 앞으로
	else return 0;
}
int recv(int index) {
	// index번째 영화부터 촬영 가능할 때 마지막 영화까지 촬영할 수 있는
	// 최대 출연료를 찾아 반환하는 함수
	if (index == n) return 0;
		// 마지막 영화넘어가면 0 반환
	if (dp[index] != -1) { // 이미 이전에 구한 값이라면 -1 이 아니므로
		return dp[index]; // 그대로 반환
	}
	dp[index] = 0;
	for (int i = index; i < n; i++) {
		// i 번째 영화를 찍으면 i번째 영화가 끝나는 일수부터 찍을 수 있는 영화를 찾는다
		int last = m[i].b;
		// m[nxt].a > last인 nxt를 찾는다. 이는 이분 탐색으로 찾아야 한다
		int left = i + 1;
		int right = n - 1;
		int mid;
		int nxt = n; // 
		// m은 촬영 시작시간을 기준으로 정렬되어있기 때문에
		// 이분탐색으로 빠르게 탐색가능하다.
		while (left <= right) {
			mid = (left + right) / 2;
			if (m[mid].a > last) {
				right = mid - 1;
				nxt = mid;
			}
			else {
				left = mid + 1;
			}
		}
		// right + 1 
		dp[index] = max(dp[index], recv(nxt) + m[i].p);
	}
	return dp[index];
}
int main() {
	clock_t start1, finish1;
	double duration;
	start1 = clock();
	memset(dp, -1, sizeof(dp)); //쓰레기 값 없애기
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		// 영화 시작과 끝, 단가 설정
		scanf_s("%d %d %d", &m[i].a, &m[i].b, &m[i].p);
	}
	// cmp 함수를 기준으로 정렬을 수행
	sort(m, m + n, cmp);
	// 답을 찾는 recv 함수 호출
	printf("%d", recv(0));
	finish1 = clock();
	duration = (double)(finish1 - start1) / CLOCKS_PER_SEC;
	printf("\n%1f초", duration);
}