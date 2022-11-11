import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numb1 = 0 , numb2 =1 , numb3;
        System.out.println("Please enter a number :");
        int numb = scan.nextInt();
        System.out.println(numb1 + "\n" + numb2);

        for(int i = 2 ; i < numb ; ++i){
            numb3 = numb1 + numb2;
            System.out.println(+numb3);
            numb1 = numb2;
            numb2 = numb3;

        }
        System.out.println();
    }
}
