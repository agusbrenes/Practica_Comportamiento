public class OperationExpression implements Expression {
    private String operator;
    private ArrayList<Expression> expressions;

    public OperationExpression(String operator) {
        this.operator = operator;
        expressions = new ArrayList();
    }

    public String getOperator() {
        return this.operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void addExpression(Expression exp) {
        this.expressions.add(exp);
    }

    public ArrayList<Expression> getExpressions() {
        return this.expressions;
    }

    @Override
    public void interpret(Context context) {
        context.setOperation(this.operator);
    }
}