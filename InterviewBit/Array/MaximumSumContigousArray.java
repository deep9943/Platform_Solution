//=========================https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public class Solution {
    public int maxSubArray(final List<Integer> A) {
        int max = Integer.MIN_VALUE;
        int end = 0;
        for(int i=0; i<A.size(); i++){
            end += A.get(i);
            
            if(max<end)
                max = end;
            
            if(end <= 0)
                end = 0;
        }
        return max;
    }
}