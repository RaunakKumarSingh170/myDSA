/*
striver algo/pseudocode{
maxLength = 0 ;
for (i=0 to n-1){
sum = 0 ;
for ( j=i to n-1) {
sum += arr[j] ;
if (sum<=k)
maxLength = Math.max( maxLength , j-i+1 ) ;
else if ( sum > k ) break ;
}} return maxLength ; }
*/

package TwoPointersSlidingWindow.LongestSubarrayWithSumK;

public class BruteApproach {
    public static int longestSubarray(int[] arr, int k){
        int n = arr.length;
        int maxLength = 0;

        for(int i=0; i<n; i++){
            int sum = 0;

            for(int j=i; j<n; j++){
                sum+=arr[j];

                if (sum<=k){
                    maxLength=Math.max(maxLength,j-i+1);
                }
            }
        }
        return maxLength;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1};
        int k = 3;

        int result = longestSubarray(arr, k);
        System.out.println("Longest subarray length:" + result);
    }
}