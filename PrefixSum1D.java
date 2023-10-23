import java.util.Scanner;

public class PrefixSum1D{
    static void prefixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prefixSum(arr);
        System.out.println(arr[3]);
    }
}