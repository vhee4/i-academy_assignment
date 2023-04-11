public class ReversingDigits {
    public static void main(String[] args) {
        reverseDigit(99878654);
    }

    public static void reverseDigit(int n) {
        int reverseVariable = 0;
        String reversed = "";
        while (n > 0) {
            int remainder = n % 10;
//            System.out.println(remainder);
            reversed += remainder + "";
            n /= 10;
//            reverseVariable = reverseVariable * 10 + remainder;
        }
        System.out.print(reversed);
    }
}
