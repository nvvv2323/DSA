/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index);
 *     public int length();
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peakIndex = peakIndexInMountainArray(mountainArr);

        // Search in the ascending part
        int left_result = binarySearch(mountainArr, 0, peakIndex, target);
        if (left_result != -1) {
            return left_result;
        }
        
        // Search in the descending part
        return reverseBinarySearch(mountainArr, peakIndex + 1, n - 1, target);
    }

    // Function to find the peak index
    public int peakIndexInMountainArray(MountainArray mountainArr) {
        int n = mountainArr.length(); // Corrected spelling
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int binarySearch(MountainArray mountainArr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    int reverseBinarySearch(MountainArray mountainArr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) == target) {
                return mid;
            } else if (mountainArr.get(mid) > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // This should be outside the while loop
    }
}
