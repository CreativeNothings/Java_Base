import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //编写倒序遍历集合接口
        ReserveList<String> rlist = new ReserveList<>();
        rlist.add("Apple");
        rlist.add("Orange");
        rlist.add("Pear");
        for (String s : rlist) {
            System.out.println(s);
        }

    }
}

class ReserveList<T> implements Iterable<T> {

    private List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ReserveIterator(list.size());
    }

    class ReserveIterator implements Iterator<T> {
        int index;

        ReserveIterator(int index) {
            this.index = index;
        }

        public boolean hasNext() {
            return index > 0;
        }

        public T next() {
            index--;
            return ReserveList.this.list.get(index);
        }
    }

}