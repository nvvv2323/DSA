class Solution {
    public int[] findErrorNums(int[] arr) {
        cyclicSort(arr);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != i + 1){
                return new int[]{arr[i] , i + 1};
            }
        }
        return new int[]{-1 , -1};
        
    }
    //function to sort the value using cyclic sort
    public void cyclicSort(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i  , correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp ;
    } 
}