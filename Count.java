import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;
            if (op == '+') result = a + b;
            else if (op == '-') result = a - b;
            else if (op == '*') result = a * b;
            else if (op == '/') result = a / b;
            else System.out.println("Invalid operator!");

            System.out.println("Result: " + result);
            sc.close();
        }


}
