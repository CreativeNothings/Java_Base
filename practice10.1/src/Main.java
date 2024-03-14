import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //练习
        //给定一组连续的整数，例如：10，11，12，……，20，
        // 但其中缺失一个数字，试找出缺失的数字：

        // 构造从start到end的序列：

        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        int found = findMissingNumber(start, end, list);
        System.out.println(list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");

    }

    static int findMissingNumber(int start, int end, List<Integer> list) {
//           int found=0;
//        if (list.get(0) != start) {
//            found = start;
//        } else if (list.get(list.size() - 1) != end) {
//            found = end;
//        } else {
//            for (int i = 1; i <= list.size() - 1; ++i) {
//                if ((list.get(i) - list.get(i - 1)) != 1) {
//                    found= list.get(i) - 1;
//                }
//            }
//        }
//        return found;
//    }
        int num = 0;
        for(int i=start;i<=end;i++){
        if(!list.contains(i)){
        num = i;}
        }
        return num;
    }
}
