//=====================https://leetcode.com/problems/robot-return-to-origin/

class Solution {
    public boolean judgeCircle(String moves) {
        char arr[] = moves.toCharArray();
        int x=0, y=0;
        for(char temp : arr){
            if(temp == 'U'){
                x++;
            }else if(temp == 'D'){
                x--;
            }else if(temp == 'L'){
                y++;
            }else{
                y--;
            }
        }
        return (x==0 && y==0);
    }
}
