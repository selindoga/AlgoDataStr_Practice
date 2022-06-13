package Reverse_Words_In_a_String_III;
// 557. Reverse Words in a String III

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int len = arr.length;

        for(int i = 0 ;i<len ;i++){
            if (arr[i] == ' '){
                int j = i-1;
                while(arr[j] != ' ' && j >= 0){
                    sb.append(arr[j--]);
                    if(j == -1){
                        break;
                    }
                }
                sb.append(" ");
            }
            else if(arr[len-1] != ' ' && (i==len-1)){
                int j = i;
                while(arr[j] != ' ' && j >= 0){
                    sb.append(arr[j--]);
                    if(j == -1){
                        break;
                    }
                }
            }
        }
        return sb.toString();
    }
}
