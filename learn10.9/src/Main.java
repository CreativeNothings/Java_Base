import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
            //set
        //元素：无序、唯一
        Set<String> set = new HashSet<>();
        System.out.println(set.add("abc"));
        System.out.println(set.add("xyz"));
        System.out.println(set.add("xyz"));//false
        System.out.println(set.contains("xyz"));
        System.out.println(set.size());
        System.out.println(set.contains("xyz!!!"));
        System.out.println(set.remove("xyz"));
        System.out.println(set.remove("xyz"));

        //我们经常用Set用于去除重复元素,与下面无关
        Set<String> set1 = new TreeSet<>();
        set1.add("apple");
        set1.add("melon");
        set1.add("pear");
        for(String s:set1){
            System.out.println(s);
        }

    }
}
