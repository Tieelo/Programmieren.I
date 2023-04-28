import java.util.Scanner;
    public class Euklid {


        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            modern (a,b);
        }

        public static void modern (int a, int b){

            int temp;
            while (a%b != 0 && (a!=0 || b!=0)){

                temp = b;
                b = a%b;
                a = temp;
            }
            System.out.println(b);
        }
    }
