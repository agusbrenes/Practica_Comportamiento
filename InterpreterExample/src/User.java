public class Interpreter {

    public static void Interpreter(String[] args) {
        Context context = new Context();
        Expression exp;
        
		for (String token: operacion) {
            if (context.getInteger(token) >= 0) {
                exp = new NumericExpression(token);
            } else {
                exp = new OperationExpression(token);
            }

            exp.interpret(context);
        }

        System.out.println("The operation's result is: " + context.getResult());
    }
}