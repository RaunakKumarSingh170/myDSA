/*
we start with a window size of 1 ,
 */

package TwoPointersSlidingWindow.LongestSubarrayWithSumK;

import java.util.*;

public class BetterApproach{

    public static int longestSubarray(int[] array, int k) {

        int n = array.length;

        int L = 0;
        int R = 0;
        int sum = 0;
        int maxLength = 0;

        while (R < n) {

            // Expand the window
            sum = sum + array[R];

            // Shrink the window if sum becomes greater than K
            while (sum > k && L <= R) {
                sum = sum - array[L];
                L++;
            }

            // Window is valid, so calculate its length
            int length = R - L + 1;

            if (length > maxLength) {
                maxLength = length;
            }

            // Move R forward
            R++;
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int[] array = {2, 5, 1, 7, 10};
        int k = 14;

        int answer = longestSubarray(array, k);

        System.out.println("Longest subarray length = " + answer);
    }
}