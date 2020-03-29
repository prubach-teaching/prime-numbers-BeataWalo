package sgh;

public class PrimeNumbers {

    public static void primes(int n) {
        int count = 0;
        int x = 0;
        int i;
        int j = 1;
        while (x < n) {
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                x = x + 1;
                if (x < n) {
                    System.out.print(j + ", ");
                } else {
                    System.out.print(j);
                }
            }
            j ++;
            count = 0;
        }
    }

    public static void main(String[] args) {
        System.out.print("n = 4: ");
        primes(4);
    }
}
