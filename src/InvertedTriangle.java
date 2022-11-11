import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int numb = scan.nextInt();

        for (int i=1; i<=numb; i++)
        {
            for (int k=numb; k>=i; k--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
