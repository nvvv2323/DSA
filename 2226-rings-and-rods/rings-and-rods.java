class Solution {
    public int countPoints(String rings) {
        HashMap<Integer , Set<Character>> map = new HashMap<>();
        //EHY WE TAKIN A i+=2
        //Every ring is represented by 2 characters
        //So, to move to the next ring, we must skip 2 positions
        for(int i = 0 ; i < rings.length() ; i+=2){
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0' ;
            if(!map.containsKey(rod)){
                map.put(rod , new HashSet<>());
            }
            map.get(rod).add(color);
        }
        int count = 0 ;
        for(Set<Character> colors : map.values()){
            if(colors.contains('R') && colors.contains('G') && colors.contains('B')){
                count++;
            }
        }
        return count;
    }
}