class Solution {
    public int maxArea(int[] height) {
       int s=0;
       int e=height.length-1;
       int max=0;
       int area=0;
       while(s<=e){
          int l=Math.min(height[s],height[e]);
          int b=e-s;
          area=Math.max(area,l*b);
          if(height[s]<height[e]){
            s++;
          }
          else{
            e--;
          }
       }
       return area;
    }
}