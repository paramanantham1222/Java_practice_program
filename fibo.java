import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int a = -1 , b = 1 , c , i ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count : ");
        int count = scan.nextInt();

        for(i =1 ; i<=count;i++){
            c = a + b ;
            a = b ;
            b = c ;
            System.out.print(" "+c +" ");
        }
    }
}
