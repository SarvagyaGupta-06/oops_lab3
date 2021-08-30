import java.util.Scanner;

public class lab3_ques2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter elements of array:");
        int x=0;
            int arr[]= new int[10];
            int arr2[]= new int[10];
            for(int i=0;i<10;i++){
                arr[i]= sc.nextInt();
            }
            for(int i=0;i<10;i++){
                arr2[i]= arr[i]*arr[i];
            }
            for(int i=0;i<10;i++){
                x = x + arr[i];
            }
            System.out.println("The square of all numbers are: ");
            for(int i=0;i<10;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println("");
            System.out.println("The sum of all numbers is = "+ x);
    }
}