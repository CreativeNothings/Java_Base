import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //多维数组:数组的数组
        int[][] ns = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(ns.length);
        System.out.println(Arrays.toString(ns[0]));

        for (int[] arr:ns){
            for (int n:arr){
                System.out.print(n);
                System.out.print(',');
            }
        }
        System.out.println(Arrays.deepToString(ns));
    }
}