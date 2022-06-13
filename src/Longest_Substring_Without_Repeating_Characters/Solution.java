// I looked this tutorial: https://www.youtube.com/watch?v=3IETreEybaA&ab_channel=NickWhite

package Longest_Substring_Without_Repeating_Characters;
// 3. Longest Substring Without Repeating Characters

import java.util.*;
import java.io.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int outer_pointer = 0;
        int inner_pointer = 0;

        HashSet<Character> ht = new HashSet();

        while(outer_pointer < s.length()){ // O(N) time complexity
            if(!ht.contains(s.charAt(outer_pointer))){ // it does not contain that character
                ht.add(s.charAt(outer_pointer));
                outer_pointer++;
                max = Math.max(ht.size(), max);
            }
            else{ // it means the hashset contains that character
                ht.remove(s.charAt(inner_pointer));
                inner_pointer++;
            }
        }
        return max;
    }
}
