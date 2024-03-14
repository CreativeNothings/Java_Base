import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("apple");
        System.out.println(list.size());
        System.out.println(list.get(0));

        //遍历List get()不推荐
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        //Iterator（推荐）
        for(Iterator<String> it = list.listIterator(); it.hasNext();){
            String s1 = it.next();
            System.out.println(s1);
            }
        for(String s3:list){
            System.out.println(s3);
        }

        //List和Array转换
            Object[] array = list.toArray();

        List<Integer> list2 = new ArrayList<>();
        Integer[] array2 =list2.toArray(new Integer[3]);

        Integer[] array3 = list2.toArray(new Integer[list.size()]);
        //Integer[] array4 = list2.toArray(Integer[]::new);


        }
    }
}