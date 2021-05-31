import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation = scan.nextLine();
        String[] tokens = operation.split("[ ]");
        Interpreter interpreter = new Interpreter(tokens);
        interpreter.interpret();
        
    }
}
