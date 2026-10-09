class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        int min = 1;
        for(int i = 0; i < piles.length;i++){
            if(piles[i] > max){
                max = piles[i];
            }
        }

        while(min <= max){
            int pivot = (min + max)/2;
            int numDays = 0;
            for(int i = 0;i < piles.length;i++){
                numDays = numDays + (piles[i] / pivot);
                if(piles[i] % pivot != 0){
                    numDays++;
                }
            }

            if(numDays > h){
                min = pivot + 1;
            }else{
                max = pivot - 1;
            }
        }

        return min;

        
        
    }
}
