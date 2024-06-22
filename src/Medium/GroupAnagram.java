package Medium;

import java.util.*;

public class GroupAnagram {
        List<List<String>> groupAnagrams(String[] strs) {
            // Initialize a HashMap to hold our groups of anagrams
            Map<String, List<String>> map = new HashMap<>();

            // Iterate through each string in the input array
            for (String word : strs) {
                // Convert the string to a character array and sort it
                char[] charArray = word.toCharArray();
                Arrays.sort(charArray);
                String sortedWord = new String(charArray);

                // If the sorted string is not already a key in the HashMap, add it with a new ArrayList
                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                // Append the original string to the list corresponding to the sorted key
                map.get(sortedWord).add(word);
            }

            // Return the values of the HashMap, which are the groups of anagrams
            return new ArrayList<>(map.values());
        }
    }

}
