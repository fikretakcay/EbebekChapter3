import java.util.Scanner;

public class MinMaxValuesCalculator {
    public static void main(String[] args) {
        int piece;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number will you enter: ");
        piece = scan.nextInt();

        int numberMax=0,numberMin=0;

        for (int i =1 ; i <= piece ; i++){
            System.out.println(i + "." +"Number: ");
            int number = scan.nextInt();
            if(i==1){
                numberMax = number;
                numberMin = number;
            }else if(number >= numberMax){
                numberMax = number;
            }else if (number < numberMin){
                numberMin = number;
            }
        }
        System.out.println("The biggest number is: " + numberMax);
        System.out.println("The lowest number is: " + numberMin);
    }
}
