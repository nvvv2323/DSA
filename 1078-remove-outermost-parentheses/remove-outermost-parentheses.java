class Solution {
    public String removeOuterParentheses(String s) {
        int counter = 0 ;
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(counter != 0){
                    ans += ch;
                }
                counter++;
            }else if(ch == ')'){
                counter--;
                if(counter != 0){
                    ans += ch;
                }
            }
        }
        return ans;
    }
}