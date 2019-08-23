package kata.foobarqix;

import java.util.HashMap;
import java.util.Map;

public class FooBarQix {

    private static final Map<Integer, String> denominatorKeywordMap = new HashMap<>();

    static {
        denominatorKeywordMap.put(3, "Foo");
        denominatorKeywordMap.put(5, "Bar");
        denominatorKeywordMap.put(7, "Qix");
    }


    public String fooBarQixResult(int numerator) {
        String result = "";
        for (Integer denominator : denominatorKeywordMap.keySet()) {
            result += returnOccurencesIfThere(numerator, denominator);
        }
        if (result.isEmpty())
            return ""+numerator;
        else
            return  "" + result;
    }

    private String returnOccurencesIfThere(int numerator, Integer denominator) {
        String result = "";
        if(isNumeratorDivisibleBy(numerator, denominator))
             result +=  denominatorKeywordMap.get(denominator);
        if(contains(numerator, denominator))
            result +=  denominatorKeywordMap.get(denominator);

        return result;
    }

    private boolean isNumeratorDivisibleBy(int numerator, int denominator) { // (6,3) returns true
        if (numerator % denominator == 0) return true;
        else return false;
    }

    private boolean contains(int entryNumber, int expression) { // (13,3) returns true
        String entryString = ""+entryNumber;
        return entryString.contains(expression+"");
    }
}
