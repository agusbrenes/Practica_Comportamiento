public class Interpreter {

    public static void Interpreter(String[] operation) {
        Context context = new Context();
        Expression exp;
        
		for (String token: operation) {
			exp = (context.getInteger(token) >= 0) ? new NumericExpression(token) : new OperationExpression(token);
            exp.interpret(context);
        }

        System.out.println("The operation's result is: " + context.getResult());
    }
}