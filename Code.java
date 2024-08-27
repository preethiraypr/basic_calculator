import java.util.Scanner;

public class Code {
    static int num2, result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        char operator;

        System.out.println("Enter first number:");
        num1 = scanner.nextInt();

        System.out.println("Enter any operator(+,-,*,/,%):");
        operator = scanner.next().charAt(0);

        char[] allowedOperators = {'+', '-', '*', '%', '/'};
        boolean isExist = contains(allowedOperators, operator);
        

        if (isExist) {
            System.out.println("Enter second number:");
            num2 = scanner.nextInt();
        }

         

        if (isExist) {
            if (operator == '+') {
                result = num1 + num2;
      
            } else if (operator == '-') {
                result = num1 - num2;
     
            } else if (operator == '*') {
                result = num1 * num2;
     
            } else if (operator == '/') {
                result = num1 / num2;
     
            } else if (operator == '%') {
                result = num1 % num2;
     
            } else {
                System.out.println("Operator Not Found!");
            }
        }

        if (isExist) {
            System.out.println("Result : " + result );
        } else {
            System.out.println("Operator Not Found!");
        }
        

    
        

    }

    // Method to check if a char value exists in a char operators
    private static boolean contains(char[] operators, char inputOperator) {
        for (char element : operators) {
            if (element == inputOperator) {
                return true;
            }
        }
        return false;
    }
}