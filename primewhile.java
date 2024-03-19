import java.util.Scanner;

public class primewhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        boolean prime = true;
        int i = 2;
        while (i<num) {
            if (num%i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        if (prime==true) {
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
    
}
