import java.util.Scanner;

public class ExcellentNumbersFindProgram {
    public static void main(String[] args) {
        int number;
        int positiveDivideNumbers = 0;
        int conclusion = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        number = scan.nextInt();
        for (int i = 2; i <= number;i++){
            if(number%i==0){
                positiveDivideNumbers = i;
                conclusion += number / positiveDivideNumbers;

            }
        }
        if(conclusion == number){
            System.out.println(number + " Number is a excellent" );
        }else{
            System.out.println(number +" Number is not a excellent");
        }
    }
}
