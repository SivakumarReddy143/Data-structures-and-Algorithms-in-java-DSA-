import java.util.Scanner;

public class PrefixSumOptimised {
    public static void prefixSum(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
         static int subMatrixSum(int arr[][],int r1,int c1,int r2,int c2){
            int sum=arr[r2][c2];
            int up=arr[r1-1][c2];
            int leftPart=arr[r2][c1-1];
            int repeatedPart=arr[r1-1][c1-1];
            int result=sum-up-leftPart+repeatedPart;

            return result;
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
        prefixSum(arr);
        int result=subMatrixSum(arr, r1, c1, r2, c2);
        System.out.println(result);
    }
}
