import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //使用Collections
        List<String> mutable = new ArrayList<>();
        mutable.add("apple");
        mutable.add("banana");
        List<String> immutable = Collections.unmodifiableList(mutable);
        mutable.add("ori");
        System.out.print(immutable);
    }
}