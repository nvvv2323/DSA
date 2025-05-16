class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //to store the charcters and there int value we will using a hashmap
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);


        //we have to compare each chracter with the next one 
        //if the value is greater then the second then we will add
        int result = map.get(s.charAt(s.length() - 1));
        for(int i = s.length() - 2 ; i >= 0 ;i--){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){

                result = result - map.get(s.charAt(i));
            }else{
                result = result + map.get(s.charAt(i));
            }
        }
        return result;


        
    }
}