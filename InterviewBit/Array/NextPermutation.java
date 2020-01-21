//================https://www.interviewbit.com/problems/next-permutation/

public class Solution {
    public int[] nextPermutation(int[] A) {
        int i;
        for(i = A.length - 1; i > 0; i--) {
            if(A[i] > A[i-1]) {
                break;
            }
        }
        if(i == 0) {
            Arrays.sort(A);
            return A;
        }
        int idx = i;
        for(int j = i; j < A.length; j++) {
            if(A[j] > A[i-1]) {
                idx = j;
            }
        }
        int tmp = A[i - 1];
        A[i - 1] = A[idx];
        A[idx] = tmp;
        Arrays.sort(A, i, A.length);
        return A;
    }
}