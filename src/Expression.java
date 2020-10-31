public class Expression {
    private RomanNumeral a;
    private RomanNumeral b;
    private char oper;
    private boolean isRoman = false;

    public Expression(String a, String b, char oper) {
        this.a = new RomanNumeral(a);
        this.b = new RomanNumeral(b);
        this.oper = oper;
        this.isRoman = true;
    }

    public Expression(Integer a, Integer b, char oper) {
        this.a = new RomanNumeral(a);
        this.b = new RomanNumeral(b);
        this.oper = oper;
    }

    public RomanNumeral getA() {
        return this.a;
    }

    public RomanNumeral getB() {
        return this.b;
    }

    public char getOperator() {
        return this.oper;
    }

    public boolean isRoman() {
        return this.isRoman;
    }
}
