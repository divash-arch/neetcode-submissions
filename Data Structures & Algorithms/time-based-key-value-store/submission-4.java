class TimeMap {
    public HashMap<String, List<valueTim>> timeMaps;

    public TimeMap() {
        timeMaps = new HashMap(); 
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(timeMaps.get(key) == null){
            timeMaps.put(key, new ArrayList());
        }
        timeMaps.get(key).add(new valueTim(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<valueTim> vt = timeMaps.get(key);
        if(vt == null){
            return "";
        }
        int start = 0;
        int end = vt.size() - 1;
        int pivot = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(vt.get(mid).timestamp < timestamp){
                start = mid +1;
            }else if(vt.get(mid).timestamp > timestamp){
                end = mid - 1;
            }else{
                pivot = mid;
                break;
            }
        }

        if(pivot != -1){
            return vt.get(pivot).value;
        }
        if(end < vt.size() && end >= 0 && vt.get(end).timestamp < timestamp){
            return vt.get(end).value;
        }else if(start < vt.size() && start >= 0 && vt.get(start).timestamp < timestamp){
            return vt.get(start).value;
        }else{
            return "";
        }
    }

    public class valueTim{
        public String value;
        public int timestamp;

        public valueTim(String v, int t){
            value = v;
            timestamp = t;
        }
    }
}
