class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        int[] count = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        int frequency = 0 ;
        for(int i = 0 ; i < 26 ; i++){
            if(count[i] != 0){
                if(frequency == 0){
                    frequency = count[i];
                }else if(count[i] != frequency){
                    return false;
                }
            }

        }
        return true;
        
    }
}