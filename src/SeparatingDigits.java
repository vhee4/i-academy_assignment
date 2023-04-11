import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 99999");
        int number = scanner.nextInt();
        ;
        displayDigits(number);
    }

    public static int calculateQuotient(int a, int b) {
        return a / b;
    }

    public static int calculateRemainder(int a, int b) {
        return a % b;
    }

    public static void displayDigits(int number) {
        int divisor = 1;
        while (number / divisor >= 10) {
            divisor *= 10; //100
        }

        while (divisor != 0) {

            int digit = (number / divisor) % 10;
            System.out.print(digit + "  ");
            divisor /= 10;
        }
    }
}

//    public static void displayDigits(int number){
//        if (number < 1 || number > 99999){
//            System.out.println("Number is out of range");
//            return;
//        }
//        int divisor = 10000;
//        String print = "";
//        while(divisor >=1){
//            int digit = calculateQuotient(number, divisor);
//            print += String.valueOf(digit).toString();
//
//            number = calculateRemainder(number, divisor);
//            divisor = divisor/10;
//        }
//
//        System.out.print(Integer.parseInt(print) + " ");
//        System.out.println();
//    }

//    public static String displayDigits(int number){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number");
//        number = scanner.nextInt();
//        StringBuilder sb = new StringBuilder();
//        while (number > 0){
//            int remainder = calculateRemainder();
//            int newNumber = calculateQuotient();
//            sb.append(remainder).append(" ");
//            number = newNumber;
//        }
////        System.out.println("the didgits are " + );
//        return sb.toString();
//    }




//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer between 1 and 99999: ");
//        int number = input.nextInt();
//        System.out.print("The digits in the integer are: ");
//        displayDigits(number);
//    }
//
//    public static int quotient(int a, int b) {
//        return a / b;
//    }
//
//    public static int remainder(int a, int b) {
//        return a % b;
//    }



