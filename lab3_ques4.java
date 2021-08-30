public class lab3_ques4{
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for(i = 41; i<250; i++) {
            if(i%5==0) {
                sum = sum + i;
            }
        }
        System.out.println("sum is = "+ sum);
    }
}