package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> values = generateMapValue();
        Integer output = 0;
        if (this.isValidInput(s)) {
            Integer valueAtPreviousPosition = values.get(s.charAt(s.length() - 1));
            output = valueAtPreviousPosition;
            for (int i = s.length() - 2; i >= 0; i--) {
                Integer valueAtCurrentPosition = values.get(s.charAt(i));
                if (valueAtPreviousPosition > valueAtCurrentPosition) {
                    output -= valueAtCurrentPosition;
                } else {
                    output += valueAtCurrentPosition;
                }
                valueAtPreviousPosition = valueAtCurrentPosition;
            }
        }
        return this.isValidOutput(output) ? output : -1;
    }

    public boolean isValidInput(String input) {
        return !(input.length() <= 0 || input.length() > 15 || !input.matches("[IVXLCDM]+"));
    }

    public boolean isValidOutput(Integer output) {
        return output >= 1 && output <= 3999;
    }

    private Map<Character, Integer> generateMapValue() {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        return values;
    }
}
