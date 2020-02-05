//=================https://www.interviewbit.com/problems/reverse-the-string/

public class Solution {
    public String solve(String A) {
        String[] arr = A.trim().split("\\s+");
        List<String> strAns = new ArrayList<>();

        for (int i=arr.length-1; i>=0; i--) {
            if (!arr[i].isEmpty()) {
                strAns.add(arr[i]);
            }
        }

        String s = String.join(" ", strAns);
        return s;
    }
}
