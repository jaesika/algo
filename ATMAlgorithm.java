package Day01;

import java.util.Arrays;
import java.util.Scanner;

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
