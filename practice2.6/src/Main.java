public class Main {
    public static void main(String[] args) {

        //练习1
        //给定一个数组，请用for循环倒序输出每一个元素：
        int[] ns = {1,4,9,16,25};
        for(int i = ns.length-1;i>=0;i--){
            System.out.println(ns[i]);
        }
    }
}