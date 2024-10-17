import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int maximumSwap(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while (num != 0) {
            int r = num % 10;
            list.add(r);
            num = num / 10;
        }
        Collections.reverse(list);
        ArrayList<Integer> maxRight = new ArrayList<>(list);
        for (int i = list.size() - 2; i >= 0; i--) {
            maxRight.set(i, Math.max(maxRight.get(i), maxRight.get(i + 1)));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < maxRight.get(i)) {
                // Find the last occurrence of the larger digit
                for (int j = list.size() - 1; j > i; j--) {
                    if (list.get(j) == maxRight.get(i)) {
                        // Swap the digits
                        int temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                        int result = 0;
                        for (int digit : list) {
                            result = result * 10 + digit;
                        }
                        return result;
                    }
                }
            }
        }
        int result = 0;
        for (int digit : list) {
            result = result * 10 + digit;
        }
        return result;
    }
}
