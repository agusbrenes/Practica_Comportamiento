import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        String[] tokens = operation.split("[ ]");
        for (String tok: tokens) {
            System.out.println(tok);
        }
        Interpreter interpreter = new Interpreter(tokens);
        interpreter.interpret();
        
    }
}
