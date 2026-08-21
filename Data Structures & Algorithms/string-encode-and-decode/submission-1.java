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
       while(str.length() > 0){
            int indexDelim = str.indexOf("#");
            int len = Integer.parseInt(str.substring(0, indexDelim));
            String sb = str.substring(indexDelim + 1, indexDelim + 1 + len);
            str = str.substring(indexDelim + 1 + len);
            ans.add(sb);
       }

       return ans;

    }
}
