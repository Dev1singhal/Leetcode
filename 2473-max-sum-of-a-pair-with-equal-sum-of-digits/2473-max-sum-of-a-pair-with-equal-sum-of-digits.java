class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for (int num : nums) {
            int digit = sumOfDigits(num);
            if (map.containsKey(digit)) {
                max = Math.max(max, map.get(digit) + num);
                map.put(digit, Math.max(map.get(digit), num));
            } else {
                map.put(digit, num);
            }
        }
        return max;
    }

    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
