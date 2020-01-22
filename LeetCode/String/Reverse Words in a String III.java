//========================https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder myString = new StringBuilder();

        for(String temp : arr){
            myString.append(new StringBuilder(temp).reverse().toString() + " ");
        }

        return myString.toString().trim();
    }
}
