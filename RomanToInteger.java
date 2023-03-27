import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String s = sc.nextLine();

        int result = romanToInt(s);
        System.out.println("The integer value of " + s + " is " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanDict = new HashMap<>();
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            int currentValue = romanDict.get(current);
            if (i < s.length() - 1) {
                char next = s.charAt(i + 1);
                int nextValue = romanDict.get(next);
                if (currentValue < nextValue) {
                    total -= currentValue;
                } else {
                    total += currentValue;
                }
            } else {
                total += currentValue;
            }
        }
        return total;
    }
}
