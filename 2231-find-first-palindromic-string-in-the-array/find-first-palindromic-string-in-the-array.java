class Solution {
    public String firstPalindrome(String[] words) {
        
        String str = "";
        for(int i = 0 ; i < words.length ; i++){
            String word = words[i];
            boolean isPalindrome = true ;
            
            for(int j = 0 ; j < word.length() / 2 ; j++){
                char start = word.charAt(j);
                char end = word.charAt(word.length() - 1 - j );
                if(start != end){
                    isPalindrome = false ;
                    break;
                }
            }

            if(isPalindrome){
                return word ; 
            }
        }
        return str ;
    }
}