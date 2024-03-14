public class Main {
    public static void main(String[] args) {

      //擦拭法
        //局限一：<T>不能是基本类型，例如int，因为实际类型是Object，
        // Object类型无法持有基本类型：
        //局限二：无法取得带泛型的Class。观察以下代码：
        Pair<String> p1 = new Pair<>("ams","djw");
        Pair<Integer> p2 = new Pair<>(123,456);
        Class c1 = p1.getClass();
        Class c2  =p2.getClass();
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(Pair.class));
        //局限三：无法判断带泛型的类型：

    }
}

class Pair<T>{
    T first;
    T last;

    public Pair(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        first = clazz.newInstance();
        last = clazz.newInstance();
    }
    public Pair(T first ,T last){
        this.first = first;
        this.last = last;
        //局限四：不能实例化T类型
        //first = new T(); compile error!

    }

    public T getFirst() {
        return first;
    }

    public T getLast(){
        return last;

    }}