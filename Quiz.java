import java.util.Scanner;
public class Quiz {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int score = 0;
            String answer;

            System.out.println("===== Simple Java Quiz =====");

            System.out.println("1. What is the size of int in Java?");
            System.out.println("a) 2 bytes");
            System.out.println("b) 4 bytes");
            System.out.println("c) 8 bytes");
            System.out.println("d) 16 bytes");
            System.out.print("Your answer: ");
            answer = sc.nextLine();

            if (answer.equals("b")) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: b) 4 bytes");
            }
                System.out.println("----------------------");

            System.out.println("\n2. Which keyword is used to inherit a class in Java?");
            System.out.println("a) this");
            System.out.println("b) super");
            System.out.println("c) extends");
            System.out.println("d) implements");
            System.out.print("Your answer: ");
            answer = sc.nextLine();

            if (answer.equals("c")) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: c) extends");
            }
                System.out.println("----------------------");

            System.out.println("\n3. Which of these is not a Java primitive data type?");
            System.out.println("a) int");
            System.out.println("b) float");
            System.out.println("c) String");
            System.out.println("d) char");
            System.out.print("Your answer: ");
            answer = sc.nextLine();

            if (answer.equals("c")) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println(" Wrong! Correct answer: c) String");
            }
                System.out.println("----------------------");


            System.out.println("\n===== Quiz Over! =====");
            System.out.println("Your total score: " + score + "/3");

            if (score == 3)
                System.out.println(" Excellent!");
            if (score == 2)
                System.out.println(" Good job!");
            if (score <= 1)
                System.out.println(" Keep practicing!");

            sc.close();
        }

}
