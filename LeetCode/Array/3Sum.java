//===============================https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length < 3) return res;
        Arrays.sort(nums);
        if (nums[0] > 0 || nums[nums.length-1] < 0) return res;
        for (int i=0; i<nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length-1;
            int left = 0 - nums[i];
            while (l < r) {
                if (nums[l] + nums[r] == left) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[l+1]) l++;
                    while (l < r && nums[r] == nums[r-1]) r--;
                    l++;
                    r--;
                } else if (nums[l] + nums[r] > left) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return res;
    }
}