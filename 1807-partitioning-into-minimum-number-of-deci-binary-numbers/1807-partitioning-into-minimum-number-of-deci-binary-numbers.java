class Solution {
    public int minPartitions(String n) {
        // char ch[]=n.toCharArray();
        int max=0;
        for(int i=0;i<n.length();i++){
            int w=n.charAt(i)-'0';
            max=Math.max(max,w);
        }
        return max;
    }
}