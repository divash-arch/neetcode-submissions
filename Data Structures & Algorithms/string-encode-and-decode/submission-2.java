class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            int size = str.length();
            sb.append(size);
            sb.append("#");
            sb.append(str);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
       List<String> ans = new ArrayList();
       int i = 0;
       while(i < str.length()){
            int indexDelim = str.indexOf("#", i);
            int len = Integer.parseInt(str.substring(i, indexDelim));
            String sb = str.substring(indexDelim + 1, indexDelim + 1 + len);
            ans.add(sb);
            i = indexDelim + 1 + len;
       }

       return ans;
        
    }
}
