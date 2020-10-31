import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your expression:");

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        Eval eval = new Eval(line);

        System.out.println(eval.getResult());
    }
}
