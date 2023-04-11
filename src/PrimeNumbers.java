public class PrimeNumbers {
    public static void main(String[] args) {

//        System.out.println(isPrime(9));
        isPrimeNumbers(10000);

    }

    public static boolean isPrime(int number) {
        if (number < 2){
            return false;
        }
        if (number % 2 == 0 && number > 2) {
            return false;
        }

        int root = (int) Math.sqrt(number);

        for (int i = 2; i <= root; i++) {
            if (number % i == 0){
//                System.out.println(i);
                return false;
            }

        }
        return true;
    }

    public static void isPrimeNumbers(int number){
        int count = 0;
        for (int i = 0; i<=number; i++) {
            if (isPrime(i) == true) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " prime numbers between 1 and 10000");
    }
}
