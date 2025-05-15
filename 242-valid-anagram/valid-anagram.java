class Solution {
    public boolean isAnagram(String s, String t) {
        //check lenght of both the string 
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];//letter from a to ....z
        for(int ch : s.toCharArray()){
            count[ch - 'a']++;//you can wright 97 inplace of a is
        }
        for(int ch : t.toCharArray()){
            count[ch - 'a']--;
        }
        for(int val : count){
            if(val != 0){
                return false;
            }
        }
        return true;

    }
}