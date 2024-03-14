import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        //treeMap
        //使用TreeMap时，放入的Key必须实现Comparable接口
        Map<String,Integer> map = new TreeMap<>();
        map.put("banana",100);
        map.put("apple",50);
        map.put("pear",25);
        for(String key:map.keySet()){
            System.out.println(key+","+map.get(key));
        }
    }
}