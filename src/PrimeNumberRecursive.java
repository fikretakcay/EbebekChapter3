import java.util.Scanner;

public class PrimeNumberRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number :");
        int numb = scan.nextInt();

        if (isPrime1(numb)) {
            System.out.println(numb + " number is prime number");
        } else {
            System.out.println(numb + " number is not prime number");
        }
    }

    static boolean isPrime1(int numb){
            return isPrime2(numb,3);
    }
    static boolean isPrime2(int numb , int i) {
        if (numb < 2) {
            return false;
        }
        if (numb % 2 == 0) {
            return (numb == 2);
        }
        if (i * i > numb) {
            return true;
        }
        if (numb % i == 0) {
            return false;
        }
        return  isPrime2(numb,i+2);
        }
}
