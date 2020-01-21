//=======================https://www.interviewbit.com/problems/min-steps-in-infinite-grid/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int xCoordinate = A.get(0);
        int yCoordinate = B.get(0);
        int steps = 0;
        int y, x = 0;
        
        for(int i=1; i<A.size(); i++){
            x = A.get(i);
            y = B.get(i);
            steps += Math.max(Math.abs(xCoordinate-x), Math.abs(yCoordinate-y));
            xCoordinate = x;
            yCoordinate = y;
        }
        return steps;
    }
}