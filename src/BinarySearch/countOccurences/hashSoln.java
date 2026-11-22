package BinarySearch.countOccurences;

import java.util.HashMap;
import java.util.HashSet;

public class hashSoln {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> uniqueCounts = new HashSet<>(counts.values());
        return counts.size() == uniqueCounts.size();
    }

    public static void main(String[] args) {
        hashSoln soln = new hashSoln();

        int[] test1 = {1, 2, 2, 1, 1, 3};
        System.out.println(soln.uniqueOccurrences(test1)); // true

        int[] test2 = {1, 2};
        System.out.println(soln.uniqueOccurrences(test2)); // false
    }
}