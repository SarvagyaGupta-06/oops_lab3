import java.util.Scanner;

public class lab3_ques1{
    public static void main(String[] args) {
        System.out.println("Enter any 3 non-repeating digits");
        Scanner sc= new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        if(n1==n2 || n2==n3 || n3==n1) {
            System.out.println("You entered repeating digits.");
        }
        else{
            String x=String.valueOf(n1);  
            String y=String.valueOf(n2); 
            String z=String.valueOf(n3); 
            System.out.println("All possible outcomes are: ");
            System.out.println(x+y+z+" , "+y+z+x+" , "+z+x+y+" , "+z+y+x+" , "+x+z+y+" , "+y+x+z);
        }

    }

}