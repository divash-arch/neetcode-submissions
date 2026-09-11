class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for(int i = 0; i < piles.length;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        int start = 1;
        int end = max;
        int t = 0;
        while( start < end){
            int mid = (start + end)/2;
            t = 0;
            for(int i = 0; i < piles.length;i++){
                t = t + (piles[i]/mid);
                if(piles[i] % mid != 0){
                    t++;
                }
            }
            if(t > h){
                start = mid +1;
            }else{
                end = mid;
            }
        }

        return end;
        
    }
}
