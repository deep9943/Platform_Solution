class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> foundSet = new HashMap<>();

        int[] returns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer now = nums[i];
            Integer lookingfor = target - now;
            if (foundSet.containsKey(lookingfor)) {
                returns[0] = foundSet.get(lookingfor);
                returns[1] = i;
                return returns;
            } else {
                foundSet.put(now, i);
            }
        }
        return returns;
    }
}