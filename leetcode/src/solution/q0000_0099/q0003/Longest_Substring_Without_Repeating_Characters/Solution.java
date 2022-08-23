package leetcode.src.solution.q0000_0099.q0003.Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int x=0, ans=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            while (set.contains(c)){
                set.remove(s.charAt(x++));
            }
            set.add(c);
            ans = Math.max(ans,i-x+1);
        }
        return ans;
    }
}
