import java.util.*;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> found = new HashMap<>();

        int[] returns = new int[2];
        for (int i = 0; i < nums.length; i++) {
            Integer first = nums[i];
            Integer current = target - now;
            if (found.containsKey(current)) {
                returns[0] = found.get(current);
                returns[1] = i;
                return returns;
            } else {
                found.put(first, i);
            }
        }
        return returns;
    }

    public static void main(String asgd[]){
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = twoSum(arr, target);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}