package BinarySearch.countOccurences;

//public class hashSoln {
//}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> uniqueCounts = new HashSet<>(counts.values());
        return counts.size() == uniqueCounts.size();
    }
}