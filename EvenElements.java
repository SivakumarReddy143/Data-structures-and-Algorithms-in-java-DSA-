import java.util.Scanner;

public class EvenElements {
    static void evenNumbers(int arr[]){
        for (int i : arr) {
            if (i%2==0) {
                System.out.print(i+" ");
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
        evenNumbers(arr);
    }
}
