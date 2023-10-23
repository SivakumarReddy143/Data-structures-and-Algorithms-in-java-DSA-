import java.util.Scanner;

public class PrefixSum2D {
    static void prefixSum(int arr[][],int r1,int c1,int r2,int c2){
        int sum=0;
        for(int i=r1;i<r2;i++){
            for(int j=c1;j<c2;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("prefix sum of a matrix: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n=sc.nextInt();
        System.out.println("enter number of columns:");
        int m=sc.nextInt();
        System.out.println("enter starting row of sub matrix:");
        int r1=sc.nextInt();
        System.out.println("enter ending row of sub matrix:");
        int r2=sc.nextInt();
        System.out.println("enter starting column of sub matrix:");
        int c1=sc.nextInt();
        System.out.println("enter ending column of sub matrix:");
        int c2=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        prefixSum(arr,r1,c1,r2,c2);
    }
}
