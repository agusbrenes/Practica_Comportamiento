public class NumericExpression implements Expression {
    private String value;
    
    public NumericExpression(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void interpret(Context context) {
        context.setOperator(context.getInteger(this.value));
        context.calculate();
    }
}