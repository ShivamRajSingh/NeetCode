/* Link : https://leetcode.com/problems/contains-duplicate/ */

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for(int i : nums){
            s.add(i);
        }

        return s.size() != nums.length ? true : false;
    }
}