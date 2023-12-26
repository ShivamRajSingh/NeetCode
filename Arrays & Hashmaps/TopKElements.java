import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int[] result = new int[k];

        for(int i =0; i < nums.length; i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i], 1);
            }
            int val = mp.get(nums[i]);
            val++;
            mp.put(nums[i], val);
        }

        List<Integer> values = new ArrayList<>(mp.values());

        Collections.sort(values, Collections.reverseOrder());

        List<Integer> kvalues = new ArrayList<>(values.subList(0,k));

        int i = 0;
        for(var entry : mp.entrySet()){
            if(kvalues.contains(entry.getValue())){
                result[i] = entry.getKey();
                i++;
            }
        }

        return result;
    }
}
