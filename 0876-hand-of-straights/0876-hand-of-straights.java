class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if (n % groupSize != 0) {
            return false;
        }
        Arrays.sort(hand);

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int card : hand) {
            freqMap.put(card, freqMap.getOrDefault(card, 0) + 1);
        }

        for (int card : hand) {
            if (freqMap.get(card) == 0) {
                continue; 
            }
            for (int i = 0; i < groupSize; i++) {
                int currentCard = card + i;
                if (freqMap.getOrDefault(currentCard, 0) == 0) {
                    return false; 
                }
                freqMap.put(currentCard, freqMap.get(currentCard) - 1);
            }
        }

        return true; 
    }
}
