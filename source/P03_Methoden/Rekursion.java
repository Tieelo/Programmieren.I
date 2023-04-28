package P03_Methoden;

public class Rekursion {
    public static void main (String[]args){
        long x = 10;
        System.out.println("Der Faktor von " + x + " ist "+factorial(x));
    }
    public static long factorial (long n){
        if (n<=1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
