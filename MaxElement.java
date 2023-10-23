import java.util.Scanner;

public class MaxElement {
    static void maxNumber(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum element in array: "+max);
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
        maxNumber(arr);
    }
}
