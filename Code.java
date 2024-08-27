import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, result;

        System.out.println("Enter first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter second number:");
        num2 = scanner.nextInt();

        result = num1 + num2;

        System.out.println("Result : " + result);
        

    }
}