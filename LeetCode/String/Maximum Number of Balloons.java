//===========https://leetcode.com/problems/maximum-number-of-balloons/

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c = new int[26];
        for(char ch: text.toCharArray()) {
            c[ch-'a'] +=1;
        }
        return Math.min(c[1], Math.min(c[0], Math.min(c[11]/2, Math.min(c[14]/2, c[13]))));
    }
}
