import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        hypotenuse(3,4);
        System.out.println();
        hypotenuse(5,12);
        System.out.println();
        hypotenuse(8,15);
    }

    public static double hypotenuse(double side1, double side2){
        double hypotenuseMethod = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.printf("%.2f", hypotenuseMethod);
        return hypotenuseMethod;
//        double side2;
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter side 1:");
//        side1 = scanner.nextDouble();

//        System.out.println("Enter side 2:");
//        side2 = scanner.nextDouble();

    }


}
