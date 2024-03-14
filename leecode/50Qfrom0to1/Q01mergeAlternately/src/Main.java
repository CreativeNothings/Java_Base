import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findTheDifference("ae","aea"));

    }
}

class Solution {
    public char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        int i=0;
        while(i<ss.length){
            if(ss[i]==tt[i]){
                ++i;
            }else{
                return tt[i];
            }
        }
        return tt[tt.length-1];
    }
}