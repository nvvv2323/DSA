// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int len =   nums1.lenght +   nums2.lenght;//lenght of two arrays
//         int[]merged = new int[len];

//         //pointer for traversing
//         int i = 0;
//         int j = 0;
//         int k = 0;//for merged array

//         while(i<nums1.lenght && j<nums2.lenght){
//             if(nums1[i]<nums2[j]){
//                 merged[k] = nums1[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 merged[k]=nums2[j];
//                 j++;
//                 k++;
//             }
//         }

//         while(i<nums1.lenght){
//             merged[k]=nums1[i];
//             i++;
//             k++;
//         }
//          while(j<nums2.lenght){
//             merged[k]=nums2[j];
//             j++;
//             k++;
//         }
//         double median =0.0;
//         int mid = merged.lenght/2;

//         if(merged.lenght%2==1){
//             median = merged[mid];

//         }else {
//             median = merge[mid] + merged[mid-1]/2;

//         }
//         return median;

        
//     }
// }























class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;  // length of two arrays
        int[] merged = new int[len];

        // pointers for traversing
        int i = 0;
        int j = 0;
        int k = 0;  // for merged array

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        double median = 0.0;
        int mid = merged.length / 2;

        if (merged.length % 2 == 1) {
            median = merged[mid];
        } else {
            median = (merged[mid] + merged[mid - 1]) / 2.0;  // Ensure floating-point division
        }

        return median;
    }
}
