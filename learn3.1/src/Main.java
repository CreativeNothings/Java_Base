import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //遍历数组
        int[] ns ={1,4,9,16,25};
        for (int n : ns) {//注意：在for (int n : ns)循环中，变量n直接拿到ns数组的元素，而不是索引。
            System.out.println(n);
        }

        int[] ns1 = {1,1,2,3,5,8,13};
        for(int n:ns1){
            System.out.print(n+",");
        }
        //Java标准库提供了Arrays.toString()
        System.out.println(Arrays.toString(ns1));
    }
}