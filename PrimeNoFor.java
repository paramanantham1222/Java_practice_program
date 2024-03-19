import java.util.Scanner;

public class PrimeNoFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Num : ");
        int num = sc.nextInt();
        boolean prime = true;
        for(int i = 2 ; i < num ; i++){
            if (num%i == 0) {
                prime = false;
                break;
            }
        }
        if (prime== true) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
