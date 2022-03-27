#include <stdio.h>
#include <stdlib.h>
#include <memory.h> 
#include<string.h>
#include <algorithm>
#include <time.h>

using namespace std;
int n; //��ȭ ���� �����Լ��� ����
struct movie { // ��ȭ ������ ����ü
	int a; // �Կ� ����
	int b; // �Կ� ��������
	int p; // �ܰ�
};

movie m[50001];
int dp[50001];

int cmp(movie m1, movie m2) {
	// ���� �ð��� �������� �����Ѵ�
	if (m1.a < m2.a) return 1;
	else if (m1.a == m2.a) return m1.b < m2.b;// ������ �����ϸ� ���ﳡ���� ���� ������
	else return 0;
}
int recv(int index) {
	// index��° ��ȭ���� �Կ� ������ �� ������ ��ȭ���� �Կ��� �� �ִ�
	// �ִ� �⿬�Ḧ ã�� ��ȯ�ϴ� �Լ�
	if (index == n) return 0;
		// ������ ��ȭ�Ѿ�� 0 ��ȯ
	if (dp[index] != -1) { // �̹� ������ ���� ���̶�� -1 �� �ƴϹǷ�
		return dp[index]; // �״�� ��ȯ
	}
	dp[index] = 0;
	for (int i = index; i < n; i++) {
		// i ��° ��ȭ�� ������ i��° ��ȭ�� ������ �ϼ����� ���� �� �ִ� ��ȭ�� ã�´�
		int last = m[i].b;
		// m[nxt].a > last�� nxt�� ã�´�. �̴� �̺� Ž������ ã�ƾ� �Ѵ�
		int left = i + 1;
		int right = n - 1;
		int mid;
		int nxt = n; // 
		// m�� �Կ� ���۽ð��� �������� ���ĵǾ��ֱ� ������
		// �̺�Ž������ ������ Ž�������ϴ�.
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
	memset(dp, -1, sizeof(dp)); //������ �� ���ֱ�
	scanf_s("%d", &n);
	for (int i = 0; i < n; i++) {
		// ��ȭ ���۰� ��, �ܰ� ����
		scanf_s("%d %d %d", &m[i].a, &m[i].b, &m[i].p);
	}
	// cmp �Լ��� �������� ������ ����
	sort(m, m + n, cmp);
	// ���� ã�� recv �Լ� ȣ��
	printf("%d", recv(0));
	finish1 = clock();
	duration = (double)(finish1 - start1) / CLOCKS_PER_SEC;
	printf("\n%1f��", duration);
}