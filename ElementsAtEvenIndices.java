import java.util.Scanner;

public class ElementsAtEvenIndices{
    static void evenIndices(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=arr[i];
            }
        }
        System.out.println("sum all elements at even indices: "+sum);
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
        evenIndices(arr);
    }
}