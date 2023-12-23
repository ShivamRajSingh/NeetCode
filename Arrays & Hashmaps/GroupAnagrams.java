// https://leetcode.com/problems/group-anagrams/

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, ArrayList<String>> mp = new HashMap<>();
        
        for(int i =0; i < strs.length; i++){
            char[] letters = strs[i].toCharArray();
            Arrays.sort(letters);
            String sortedWord = String.valueOf(letters);

            if(!mp.containsKey(sortedWord)){
                mp.put(sortedWord, new ArrayList<>());
            }
            mp.get(sortedWord).add(strs[i]);
        }
        result.addAll(mp.values());
        return result;
    }
}
