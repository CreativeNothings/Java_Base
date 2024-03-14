import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //数组排序
        //冒泡排序
        int[] ns = {28,12,89,73,65,18,96,50,8,36};
        //排序前
        System.out.println(Arrays.toString(ns));

      /*  for (int i=0;i< ns.length-1;i++){
            for(int j=0;j< ns.length-i-1;j++){
                if(ns[j]<ns[j+1]){
                    //swap
                    int temp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = temp;
                }
            }
        }*/
        Arrays.sort(ns);
        //排序后
        System.out.println(Arrays.toString(ns));
    }
}