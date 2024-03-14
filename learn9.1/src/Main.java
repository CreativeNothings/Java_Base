import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //泛型
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        String first = list.get(0);

        List<Number> listNum = new ArrayList<>();
        listNum.add(123);
        listNum.add(12.34);
        Number first1 = listNum.get(0);

    }
}