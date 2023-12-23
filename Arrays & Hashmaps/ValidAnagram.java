// https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
 
        for(int i =0; i < s.length(); i++){
            int letter = (int)s.charAt(i);
            letter = letter-97;
            freq[letter]++;
        }
 
        for(int i =0; i < t.length(); i++){
            int letter = (int)t.charAt(i);
            letter = letter-97;
            freq[letter]--;
        }
 
        for(int i =0; i < 26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
 
        return true;  
    }
}
