import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeral {
    private int intValue;
    private String strValue;
    private LinkedHashMap<String, Integer> romans = new LinkedHashMap<>() {
        {
            put("C", 100);
            put("XC", 90);
            put("L", 50);
            put("XL", 40);
            put("X", 10);
            put("IX", 9);
            put("V", 5);
            put("IV", 4);
            put("I", 1);
        }
    };

    public RomanNumeral(String value) {
        this.strValue = value;
        this.intValue = getIndianNumeral(value);
    }

    public RomanNumeral(Integer value) {
        this.strValue = getRomanNumeral(value);
        this.intValue = value;
    }

    public int getInt() {
        return this.intValue;
    }

    public String getStr() {
        return this.strValue;
    }

    private int getIndianNumeral(String input) {
        int result = 0;

        for (Map.Entry<String, Integer> entry : romans.entrySet()) {
            while (input.startsWith(entry.getKey())) {
                result += entry.getValue();
                input = input.substring(entry.getKey().length());
            }
        }

        return result;
    }

    public String getRomanNumeral(int input) {
        String reuslt = "";

        for (Map.Entry<String, Integer> entry : romans.entrySet()) {
            while (input >= entry.getValue()) {
                reuslt += entry.getKey();
                input -= entry.getValue();
            }
        }

        return reuslt;
    }
}
