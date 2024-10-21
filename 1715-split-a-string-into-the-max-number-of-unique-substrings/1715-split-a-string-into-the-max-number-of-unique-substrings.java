class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet<>();
        return check(s, set);
    }

    static int check(String s, HashSet<String> set) {
        if (s.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (int i = 1; i <= s.length(); i++) {
            String word = s.substring(0, i);
            if (!set.contains(word)) {
                set.add(word);
                max = Math.max(max, 1 + check(s.substring(i), set));
                set.remove(word);
            }
        }

        return max;
    }
}
