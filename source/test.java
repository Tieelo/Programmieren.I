public class test {
    public static void main(String[] args) {
        int sum = 0;
        int n = 52;
       // for (int n = 1; n < 100; n++) {
         //   System.out.println("n = " +  n);
            for (int i = 1; i < n; i = 2 * i) {
                System.out.println("i = " +i);
                for (int j = n; j > i; j = j - 1) {
                    System.out.println("j = " + j);
                    for (int k = 0; k < n; k = k + 2) {
                        sum++;
                        System.out.println("k = " + k );
                    }
                    for (int k = n; k >= 0; k = k / 4) {
                        sum++;
                        System.out.println("2. k = " + k + "\n" + sum);
                    }
                }
            }
        }
    }
//}
