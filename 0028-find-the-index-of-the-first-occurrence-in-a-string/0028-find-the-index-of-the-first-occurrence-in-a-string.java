class Solution {
    public int strStr(String haystack, String needle) {
        int answer = -1;
        if(haystack.equals(needle)) return 0;
        for(int i = 0; i <= haystack.length()-needle.length(); i++){
            if(haystack.startsWith(needle,i)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}