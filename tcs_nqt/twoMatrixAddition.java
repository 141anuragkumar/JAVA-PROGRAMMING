package tcs_nqt;

import java.util.Scanner;
public class twoMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("start");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] sum = new int [n][n];

        System.out.println("Enter the first matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt(); 
            }
        }

        System.out.println("Enter the second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(sum[i][j] +" ");
            }
            System.out.println();
        }
        sc.close();

    }

    
    
}
