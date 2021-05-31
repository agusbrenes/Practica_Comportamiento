public class Context {
	private String nextOp = "";
	private int operator = 0;
	private int result = 0;

	public int getInteger(String number) {
		return switch (number.toLowerCase()) {
			case "zero" -> 0;
			case "one" -> 1;
			case "two" -> 2;
			case "three" -> 3;
			case "four" -> 4;
			case "five" -> 5;
			case "six" -> 6;
			case "seven" -> 7;
			case "eight" -> 8;
			case "nine" -> 9;
			default -> -1;
		}
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

	public void setOperation(String operation) {
		if (operation.equalsIgnoreCase("plus")) {
			this.nextOp = "+";
		} else if (operation.equalsIgnoreCase("minus")) {
			this.nextOp = "-";
		}
	}
}