class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int countForL = 0;
        int countForR = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L'){
                countForL++;
            }else{
                countForR++;
            }

            if((countForL == countForR) && (countForL != 0) && (countForR != 0)){
                count++;
                countForL = 0;
                countForR = 0;
            }
        }
        return count;
    }
}
