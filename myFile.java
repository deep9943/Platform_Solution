import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] array = getValues();
        Arrays.sort(array);

        int q1 = findMedian(array, 0, array.length / 2 - 1);
        int q2 = findMedian(array, 0, array.length - 1);
        int q3 = findMedian(array, (array.length + 1) / 2, array.length - 1);

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }

    /* Creates array from input */
    private static int [] getValues() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }

    /* Treats elements from "start" to "end" (inclusive) as an array and calculates its median */
    private static int findMedian(int [] array, int start, int end) {
        if ((end - start) % 2 == 0) { // odd number of elements
            return (array[(end + start) / 2]);
        } else { // even number of elements
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return Math.round((value1 + value2) / 2);
        }
    }
}





//=================================Interquartile Range================================
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] element = new int[size];
        int [] frequency = new int[size];
        for (int i = 0; i < size; i++) {
            element[i] = scan.nextInt();
        }
        int numElements = 0;
        for (int i = 0; i < size; i++) {
            frequency[i] = scan.nextInt();
            numElements += frequency[i];
        }
        scan.close();


        int [] data = new int[numElements];
        int dataIndex = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                data[dataIndex] = element[i];
                dataIndex++;
            }
        }
        Arrays.sort(data);


        double q1 = findMedian(data, 0, data.length / 2 - 1);
        double q3 = findMedian(data, (data.length + 1) / 2, data.length - 1);
        System.out.println(q3 - q1);
    }

    public static double findMedian(int [] array, int start, int end) {
        if ((end - start) % 2 == 0) {
            return (array[(end + start) / 2]);
        } else {
            int value1 = array[(end + start) / 2];
            int value2 = array[(end + start) / 2 + 1];
            return (value1 + value2) / 2.0;
        }
    }
}



//=======================================================Standard Deviation=================================================
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();

        System.out.format("%.1f", standardDeviation(array));
    }

    public static double getMean(int [] array) {
        int sum = 0;
        for (int x : array) {
            sum += x;
        }
        return (double) sum / array.length;
    }

    public static double standardDeviation(int [] array) {
        double mean = getMean(array);
        double sum = 0;
        for (int x : array) {
            sum += Math.pow(x - mean, 2);
        }
        double variance = sum / array.length;
        return Math.sqrt(variance);
    }
}




//===============================================
