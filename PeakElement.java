import java.util.Scanner;

public class PeakElement {
    static void peakNumber(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println("first peak element in the array: "+arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        peakNumber(arr);
    }
}
