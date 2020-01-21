
public class Solution {
    public static boolean placingFlowers(int[] flower, int n) {
        int i = 0, count = 0;
        while (i < flower.length) {
            if (flower[i] == 0 && (i == 0 || flower[i - 1] == 0) && (i == flower.length - 1 || flower[i + 1] == 0)) {
                flower[i] = 1;
                count++;
            }
            i++;
        }
        return count >= n;
    }

    public static void main(String asgd[]){
        int arr[] = {1, 0, 0, 0, 1};
        int target = 1;
        System.out.println(placingFlowers(arr, target));
    }
}