class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        int count[]=new int[26];
        Arrays.fill(count,0);
        for(char ch:p.toCharArray()){
            count[ch-'a']++;
        }
        int i=0;
        int j=0;
        List<Integer>list=new ArrayList<>();
        while(j<n){
            int idx=s.charAt(j)-'a';
            count[idx]--;
            if(j-i+1==m){
                if(nozero(count)){
                    list.add(i);
                }
                count[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return list;
    }
    static boolean nozero(int num[]){
        for(int n:num){
            if(n!=0){
                return false;
            }
        }
        return true;
    }
}