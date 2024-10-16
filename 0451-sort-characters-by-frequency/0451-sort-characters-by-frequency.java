class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++){
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char key:map.keySet()){
            pq.offer(key);
        }
        while (!pq.isEmpty()) {
            char current = pq.poll();
            int count = map.get(current);
            for (int i = 0; i < count; i++) {
                sb.append(current);
            }
        }
        return sb.toString();
    }
}