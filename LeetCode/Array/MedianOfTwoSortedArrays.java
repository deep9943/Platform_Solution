class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0;
        int r1 = nums1.length-1;
        int l2 = 0;
        int r2 = nums2.length-1;
        int L = 0;
        int R = 0;

        while (l1 <= r1 && l2 <= r2) {
            if (nums1[l1] <= nums2[l2]) {
                L = nums1[l1];
                l1++;
            } else {
                L = nums2[l2];
                l2++;
            }

            if (nums1[r1] <= nums2[r2]) {
                R = nums2[r2];
                r2--;
            } else {
                R = nums1[r1];
                r1--;
            }
        }

        if (l1 > r1 && l2 > r2) {
            return (L + R) / 2.0;
        } else if (l1 > r1) {
            int mid = (l2 + r2) / 2;
            if ((l2 + r2)%2 == 0) {
                return nums2[mid];
            } else {
                return (nums2[mid] + nums2[mid+1]) / 2.0;
            }
        } else {
            int mid = (l1 + r1) / 2;
            if ((l1 + r1)%2 == 0) {
                return nums1[mid];
            } else {
                return (nums1[mid] + nums1[mid+1]) / 2.0;
            }
        }
    }
}   