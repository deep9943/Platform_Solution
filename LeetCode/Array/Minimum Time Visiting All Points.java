//=======================https://leetcode.com/problems/minimum-time-visiting-all-points/

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;

        for(int i=0; i<points.length-1; i++){
            int a[] = points[i];
            int b[] = points[i+1];
            int tempTime = Math.max(Math.abs(a[0] - b[0]), Math.abs(a[1] - b[1]));
            result += tempTime;
        }

        return result;
    }
}
