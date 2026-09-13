package TwoPointersSlidingWindow.MaxPointsNcards;
//
//public class BetterApproach {
//}
//class Solution {
//    public int lengthOfLongestSubstring(String s) {
//        int[] hash = new int[256];
//        Arrays.fill(hash, -1);
//        int r = 0, l = 0, currLen = 0, maxLen = 0;
//
//        while (r < s.length()){
//            if (hash[s.charAt(r)]!=-1){
//                if (hash[s.charAt(r)]>=l){
//                    l = hash[s.charAt(r)] + 1 ;
//                }
//            }
//            currLen =  r - l + 1 ;
//            maxLen = Math.max(currLen , maxLen) ;
//            hash[s.charAt(r)] = r ;
//            r++ ;
//        }
//
//        return maxLen ;
//
//    }
//}