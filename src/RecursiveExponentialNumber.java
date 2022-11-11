public class RecursiveExponentialNumber {
    public static int exp(int base,int exponent){
        if(base == 0){
            return 1;
        }else if(base == 0){
            return 1;
        }else {
            return base*exp(base,exponent-1);
        }


    }

    public static void main(String[] args) {
        System.out.println(exp(3,6));
    }
}
