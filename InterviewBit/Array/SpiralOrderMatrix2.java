//=============https://www.interviewbit.com/problems/spiral-order-matrix-ii/

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int i=0;i<A;i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(Collections.nCopies(A, 0));
            ans.add(temp);
        }
        int j = 0;
        int k = 0;
        int start = 0;
        int end = A;
        String dir = "R";
        int n = 1;
        int limit = A*A;

        while (n <= limit) {
            if ("R".equals(dir)) {
                while (k < end && n <= limit) {
                    ans.get(j).set(k, n);
                    n++;
                    k++;
                }
                j++;
                k--;
                dir = "D";
            }
            else if ("D".equals(dir)) {
                while (j < end && n <= limit) {
                    ans.get(j).set(k, n);
                    n++;
                    j++;
                }
                k--;
                j--;
                dir = "L";
                end--;
            }
            else if ("L".equals(dir)) {
                while (k >= start && n <= limit) {
                    ans.get(j).set(k,n);
                    n++;
                    k--;
                }
                k++;
                j--;
                dir = "U";
                start++;
            }
            else if ("U".equals(dir)) {
                while (j >= start && n <= limit) {
                    ans.get(j).set(k, n);
                    j--;
                    n++;
                }
                j++;
                k++;
                dir = "R";
            }
        }
        return ans;
    }
}