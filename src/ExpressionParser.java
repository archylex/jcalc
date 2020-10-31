public class ExpressionParser {
    private Expression expression;

    public ExpressionParser(String input) {
        try {
            String[] vals = input.split(" ");

            Validator.isParamsSuccess(vals);

            Validator.isOperatorRangeSuccess(vals[1].charAt(0));

            boolean isIntA = Validator.isInt(vals[0]);
            boolean isIntB = Validator.isInt(vals[2]);

            Validator.isSameTypes(isIntA, isIntB);

            if (isIntA) {
                int a = Integer.parseInt(vals[0]);
                int b = Integer.parseInt(vals[2]);

                Validator.isRangeSuccess(a);
                Validator.isRangeSuccess(b);

                this.expression = new Expression(a, b, vals[1].charAt(0));
            } else {
                this.expression = new Expression(vals[0], vals[2], vals[1].charAt(0));

                int a = this.expression.getA().getInt();
                int b = this.expression.getB().getInt();

                Validator.isRomanSuccess(a);
                Validator.isRomanSuccess(b);

                Validator.isRangeSuccess(a);
                Validator.isRangeSuccess(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(2);
        }
    }

    public Expression getElements() {
        return this.expression;
    }
}
