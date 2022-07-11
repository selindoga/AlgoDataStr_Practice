package Permutation_in_String;
// 567. Permutation in String

import java.util.HashSet;

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int op = 0;

        HashSet<Character> hs = new HashSet<>();
        char[] _s1 = s1.toCharArray();
        for(char a : _s1){
            hs.add(a);
        }

        if(s1.length() == 1){
            HashSet<Character> hss = new HashSet<>();
            char[] _s2 = s2.toCharArray();
            for(char a : _s2){
                hss.add(a);
            }

            if(hss.contains(s1.charAt(0))){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            while(op < s2.length()){
                if(hs.contains(s2.charAt(op))){
                    for(int i = op+1; i < s2.length(); i++){
                        int s1_len = hs.size()-1;
                        if(hs.contains(s2.charAt(i))){
                            s1_len--;
                            if(s1_len == 0){
                                return true;
                            }
                        }
                        else{
                            break;
                        }
                    }
                }
                op++;
            }
            return false;
        }
    }
}
