package Day01;
/*
문제
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때,
아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.

- 입력 -
첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다.
집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
- 출력 -
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
*/

import java.util.Scanner;

public class RGB_Algorithm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] x = new int[n][3];
        int[][] answer = new int[n][3];

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++) {
                x[i][j] = scan.nextInt();
            }
        }

        answer[0][0] = x[0][0];
        answer[0][1] = x[0][1];
        answer[0][2] = x[0][2];

        for(int i=1; i<n; i++) {
            answer[i][0] = Math.min(answer[i-1][1], answer[i-1][2]) + x[i][0];
            answer[i][1] = Math.min(answer[i-1][0], answer[i-1][2]) + x[i][1];
            answer[i][2] = Math.min(answer[i-1][0], answer[i-1][1]) + x[i][2];
        }
        int result = Math.min(Math.min(answer[n-1][0], answer[n-1][1]), answer[n-1][2]);
        System.out.println(result);
    }

}
