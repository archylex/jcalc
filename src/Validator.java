import java.util.regex.Pattern;

public class Validator {
    public static boolean isRangeSuccess(int n) throws Exception {
        if (n >= 1 && n <= 10)
            return true;
        else
            throw new Exception("Invalid range: " + n);
    }

    public static boolean isOperatorRangeSuccess(char oper) throws Exception {
        if ("+-/*".indexOf(oper) != -1)
            return true;
        else
            throw new Exception("Invalid operator: " + oper);
    }

    public static boolean isParamsSuccess(String[] s) throws Exception {
        if (s != null && s.length != 3)
            throw new Exception("Invalid expression: " + s);
        else
            return true;
    }

    public static boolean isInt(String n) {
        Pattern pattern = Pattern.compile("^\\d+$");
        return pattern.matcher(n).matches() ? true : false;
    }

    public static boolean isSameTypes(boolean a, boolean b) throws Exception {
        if (a == b)
            return true;
        else
            throw new Exception("Different format");
    }

    public static boolean isRomanSuccess(int n) throws Exception {
        if (n == 0)
            throw new Exception("Bad roman numeral");
        else
            return true;
    }
}
