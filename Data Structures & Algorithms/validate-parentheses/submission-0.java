class Solution {
    public boolean isValid(String s) {
       HashMap<Character, Character> cb = new HashMap<>();
        cb.put(')', '(');
        cb.put('}', '{');
        cb.put(']', '[');

        int i = 0;
        int len = s.length();
        Character [] track = new Character[len];
        int t = 0;

        while(i < len){
            while(i < len && cb.containsKey(s.charAt(i)) && t > 0  && track[t-1] == cb.get(s.charAt(i))){
                t--;
                i++;
            }
            if(i == len){
                break;
            }
            track[t++] = s.charAt(i++);
        }

        return t == 0;

    }
}
