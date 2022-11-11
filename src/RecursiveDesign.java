import java.util.Scanner;

public class RecursiveDesign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N numb:");
        int n = scan.nextInt();
        alt(n);
    }

    static void alt(int n) {
        alt(n,0);

    }
    static int alt(int n ,int count){
        if(n<=0){
            return üst(n,count);
        }
        System.out.println(n+" ");
        return alt(n-5,++count);
    }

    static int üst(int n, int count) {
        System.out.println(n+" ");
        if(count == 0)
            System.exit(0);
        return üst(n+5,--count);
    }

}
