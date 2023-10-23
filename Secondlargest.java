import java.util.Scanner;

public class Secondlargest{
    static void secLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondMax=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
        }
        System.out.println("second largest element in array is: "+secondMax);
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
        secLargest(arr);
    }
}