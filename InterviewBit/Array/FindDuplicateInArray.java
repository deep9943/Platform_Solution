//===============https://www.interviewbit.com/problems/find-duplicate-in-array/

public class Solution {
    public int repeatedNumber(final List<Integer> A) {
        int[] arr = new int[A.size()-1];
        for(int num : A) {
            arr[num-1]++;
            if (arr[num-1] > 1) {
                return num;
            }
        }
        return -1;
    }
}
