package kata.primefactor;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public Integer[] primeFactor(int number) {
        if (number == 1)
            return new Integer[] {};
        else {
            List<Integer> multipliers = new ArrayList<>();
            extractMultipliers(number, number-1, multipliers);

            if(multipliers.size() >= 1)
                return multipliers.toArray(new Integer[multipliers.size()]);
            else
                return new Integer[] {number};
        }
    }

    private void extractMultipliers(int number, int cursor, List<Integer> multipliers) {
        if (cursor <= 1) {
            return;
        }
        if (number % cursor == 0) {
            multipliers.add(cursor);
            multipliers.add(number / cursor);
            return;
        }
        extractMultipliers(number, cursor-1, multipliers);
    }
}
