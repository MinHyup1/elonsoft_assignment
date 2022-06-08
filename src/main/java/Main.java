import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("수식을 입력하세요");
        Scanner in = new Scanner(System.in);
        String mathExpression = in.nextLine();
        in.close();
        Calculator calculator = new Calculator();
        calculator.run(mathExpression);
    }
}
