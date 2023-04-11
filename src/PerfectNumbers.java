public class PerfectNumbers {
    //perfect numbers. the sum of the factors = the number
    //program to get the factors of a given number
    //given a number 6, the factors will divide 6 and give a remainder of 0

    public static void main(String[] args) {
        System.out.println(returnPerfectNumber(1000));
    }

    public static boolean getFactor(int perfectNumber){
        int sum = 0;
        for (int i = 1; i < perfectNumber; i++){
            if (perfectNumber % i == 0){
                sum = sum + i ;
            }
        }
        if (sum == perfectNumber){
//            System.out.println(perfectNumber + " is a perfect number");
            return true;
        }
        return false;
    }
    public static String returnPerfectNumber(int n){
        String perfectNumber = "";
        for (int i = 1; i <= n; i++){
            if (getFactor(i)) {
                perfectNumber+=i+" ";
            }
        }
        return perfectNumber;
    }
}
