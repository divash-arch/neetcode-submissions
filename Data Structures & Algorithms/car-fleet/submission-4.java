class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        fleet [] fleets = new fleet[position.length];

        for(int i = 0; i < position.length;i++){
            fleets[i] = new fleet(position[i], (double)(target - position[i])/speed[i]);
        }


        Arrays.sort(fleets, (a, b) -> b.position - a.position);

        double[] ans = new double[position.length];
        ans[0] = fleets[0].timeToreach;
        int k = 0;
        for(int i = 1; i < fleets.length;i++){
            if(fleets[i].timeToreach <= ans[k]){
                continue;
            }
            ans[++k] = fleets[i].timeToreach;
            
        }
        return k+1;
        
    }

    public class fleet {
        int position;
        double timeToreach;

        public fleet (int pos, double tr){
            position = pos;
            timeToreach = tr;
        }
    }
}
