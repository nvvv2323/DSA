class Solution {
    public boolean containsDuplicate(int[] arr) {
        
        //we are using the inbuilt function to sort the array
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i + 1]){
                return true; 
            }
        }
        return false ;
    }
}