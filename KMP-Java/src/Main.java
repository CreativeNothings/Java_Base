public class Main {
    public static void main(String[] args) {
        String ss = "abcdaaabcaaabbab";
        String pp = "aaabbab";
//        for (int i : Str(ss, pp)) {
//            System.out.println(i);
//        }
        System.out.println(Str(ss, pp));
    }

    static int Str(String ss, String pp) {
//        // 分别读取原串和匹配串的长度
        int n = ss.length(), m = pp.length();
//        int n = ss.length(), m = pp.length();
//        // 原串和匹配串前面都加空格，使其下标从 1 开始
        ss = " " + ss;
        pp = " " + pp;
//        ss = " " + ss;
//        pp = " " + pp;
//
        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();
//        char[] s = ss.toCharArray();
//        char[] p = pp.toCharArray();
//
//        // 构建 next 数组，数组长度为匹配串的长度（next 数组是和匹配串相关的）
        int[] next = new int[m + 1];
//        int[] next = new int[m + 1];
//        // 构造过程 i = 2，j = 0 开始，i 小于等于匹配串长度 【构造 i 从 2 开始】
        for (int i = 2, j = 0; i < m + 1; i++) {


//        for (int i = 2, j = 0; i <= m; i++) {
            while (j > 0 && p[i] != p[j + 1]) {
                j = next[j];
            }
//            // 匹配不成功的话，j = next(j)
//            while (j > 0 && p[i] != p[j + 1]) j = next[j];
            if (p[i] == p[j + 1]) {
                j++;
            }
//            // 匹配成功的话，先让 j++
//            if (p[i] == p[j + 1]) j++;
            next[i] = j;
//            // 更新 next[i]，结束本次循环，i++
//            next[i] = j;
//
//
//        }
        }
        for (int i = 1, j = 0; i < n + 1; i++) {


//        //匹配过程,n是原串长度
//        for(int i=1,j=0;i<=n;i++){
            while (j > 0 && s[i] != p[j + 1]) {
                j = next[j];
            }
//            //匹配失败
//            while(j>0&&s[i]!=p[j+1]){
//                j = next[j];
//            }
            if (s[i] == p[j + 1]) {
                j++;
            }
//            //匹配成功，先j++再结束循环（i++）
//            if(s[i]==p[j+1]){
//                j++;
//            }
            if (j == m) return i - m;
//            if(j==m) return i-m;
//        }

//        return -1;
        }
        return -1;
    }
}

