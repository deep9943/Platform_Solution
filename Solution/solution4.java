
class Solution {
    public static boolean result(int[] A) {
        int N = A.length;
        int i = 0;
        while (i+1 < N && A[i] < A[i+1]){
            i++;
        }
        if (i == 0 || i == N-1){
            return false;
        }
        while (i+1 < N && A[i] > A[i+1]){
            i++;
        }
        return i == N-1;
    }

    public static void main(String asgd[]){
        int arr[] = {0, 3, 2, 1};
        System.out.println(result(arr));
    }
}