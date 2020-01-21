//==================https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=0; i<nums.length; i=i+2){
            for(int j=0; j<nums[i]; j++){
                arr.add(nums[i+1]);
            }
        }

        int array[] = new int[arr.size()];
        int i=0;
        for(int num: arr) {
            array[i++] = num;
        }

        return array;
    }
}
