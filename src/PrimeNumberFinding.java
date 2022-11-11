import java.util.Scanner;

public class PrimeNumberFinding {
    public static void main(String[] args) {
        int counter = 0;
        for (int numb=2;numb<=100;numb++){
            int check = 0;
            for(int i=2;i<numb;i++){
                if(numb % i == 0){
                    check = 1;
                    break;
                }
            }
            if(check ==0){
                System.out.println(numb+"\n");
                counter++;
            }
        }
    }
}
