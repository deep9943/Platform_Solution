//==============https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/

class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] ans = new int[queries.length];
        int[] count = new int[11];

        for(String W : words)
            count[f(W)-1]++;

        for(int i=9;i>=1;i--)
            count[i] += count[i+1];

        for(int i=0;i<queries.length;i++)
            ans[i] = count[f(queries[i])];

        return ans;
    }

    public int f(String s){
        int min = 25;
        int freq = 0;

        for(int i=0;i<s.length();i++){
            int ch = (int)s.charAt(i)-97;
            if(ch < min){
                freq = 1;
                min = ch;
            }else if(ch == min)
                freq++;
        }

        return freq;
    }
}
