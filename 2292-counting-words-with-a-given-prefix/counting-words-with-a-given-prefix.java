class Solution {
    public int prefixCount(String[] words, String pref) {
        
        int prefCount = 0 ;
        for(String word : words){

            if(word.length() >= pref.length()){
                
                if(word.substring(0 , pref.length()).equals(pref)){
                    prefCount++;
                }
            }
        }
        return prefCount;
    }
}