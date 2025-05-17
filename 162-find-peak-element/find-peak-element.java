class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0 ;
        int end = arr.length - 1;
        
        //appli binary search 
        while (start < end ){
            int mid = start + (end - start )/2;
            if(arr[mid] > arr[mid + 1]){
                //it means you are in the decerasing part of the array
                //this may be the answer (peak index) ,  but look at the left 
                //this is why mid != mid - 1;
                end = mid;
            }else{
                //you are in incresiong part of an array
                start = mid + 1;//
            }
        }
        return end ;
        
    }
}