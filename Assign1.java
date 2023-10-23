import java.util.Scanner;

public class Assign1{
    static void operate(int arr[][]){
        int positiveCount=0;
        int negativeCount=0;
        int oddNumberCount=0;
        int evenNumberCount=0;
        int zeroCount=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]>0){
                    positiveCount++;
                }
                if(arr[i][j]<0){
                    negativeCount++;
                }
                if(arr[i][j]==0){
                    zeroCount++;
                }
                if(arr[i][j]%2==0){
                    evenNumberCount++;
                }
                if(arr[i][j]%2!=0){
                    oddNumberCount++;
                }
            }
        }
                System.out.println("Number of positive numbers:"+positiveCount);
                System.out.println("Number of negative numbers:"+negativeCount);
                System.out.println("Number of odd numbers:"+oddNumberCount);
                System.out.println("Number of even numbers:"+evenNumberCount);
                System.out.println("Number of zero numbers:"+zeroCount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int n=sc.nextInt();
        System.out.println("enter number of columns:");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        operate(arr);
    }
}