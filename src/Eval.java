public class Eval {
    private int result = 0;
    private boolean isRoman = false;

    public Eval(String line) {
        ExpressionParser exp = new ExpressionParser(line);
        int a = exp.getElements().getA().getInt();
        int b = exp.getElements().getB().getInt();

        this.isRoman = exp.getElements().isRoman();

        switch (exp.getElements().getOperator()) {
            case '+':
                this.result = a + b;
                break;
            case '-':
                this.result = a - b;
                break;
            case '*':
                this.result = a * b;
                break;
            case '/':
                this.result = a / b;
                break;
        }
    }

    public String getResult() {
        return this.isRoman ? new RomanNumeral(this.result).getStr() : String.valueOf(this.result);
    }
}
