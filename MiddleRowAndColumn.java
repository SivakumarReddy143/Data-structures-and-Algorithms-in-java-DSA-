import java.util.Scanner;

public class MiddleRowAndColumn {
    static void middleElements(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==arr[0].length/2||arr.length/2==i){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
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
        middleElements(arr);
    }
}
