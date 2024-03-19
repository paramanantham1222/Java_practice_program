import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Enter a num : ");
        int num = one.nextInt();
        boolean prime = true;
        for(int i = 2; i<num;i++){
            if (num%i ==0) {
                prime = false;
                break;
            }
        }
        if (prime==true) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime num");
        }
        one.close();
    }
    
}
