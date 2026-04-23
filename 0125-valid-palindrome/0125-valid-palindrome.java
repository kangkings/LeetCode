class Solution {
    public boolean isPalindrome(String s) {
        boolean answer = true;
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                answer = false;
                break;
            }
        }
        return answer;
    }
}