package Day01;

import java.util.Arrays;
import java.util.Scanner;

/*
* n명이 줄을 서는데 i번쨰는 P[i]만큼 시간을 쓴다고 하자 줄을 서게 되면 앞에 사람의 기다리는 시간까지 모두
* 합한 값을 기다리게 되는데 최소로 시간이 걸리려면 얼마나 되는가?
* */

public class ATMAlgorithm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum=0;
        int[] P;

        n = scan.nextInt();
        P = new int[n];
        for(int i=0; i<n; i++){
            P[i] = scan.nextInt();
        }

        Arrays.sort(P);
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++){
                sum += P[j];
            }
        }
        System.out.println(sum);
    }
}
