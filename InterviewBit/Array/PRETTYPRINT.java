//==============https://www.interviewbit.com/problems/prettyprint/

public class Solution {
    public int[][] prettyPrint(int A) {
        int k = A;
        int[][] ans = new int[2 * A - 1][2 * A - 1];

        for(int i = 0; i < A; i++) {
            for(int j = i; j < ans.length - i; j++) {
                ans[i][j] = k;
                ans[j][i] = k;
                ans[ans.length - 1 - i][ans.length - 1 - j] = k;
                ans[ans.length - 1- j][ans.length - 1 - i] = k;
            }
            k--;
        }

        return ans;
    }
}
