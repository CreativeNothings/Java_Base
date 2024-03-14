public class Main {
    public static void main(String[] args) {

        //super通配符，注意和extends的对比,遵循PECS原则（producer extends consumer super）
        Pair<Number> p1 = new Pair<>(12.3,4.56);
        Pair<Integer> p2 = new Pair<>(123,456);
        setSame(p1,100);
        setSame(p2,200);
        System.out.println(p1.getFirst() + ", " + p1.getLast());
        System.out.println(p2.getFirst() + ", " + p2.getLast());
    }
        //在Pair<? super Integer>的setFirst()方法，实际上void setFirst(? super Ingeter)
        //同理getFirst()方法也变为 ？ super Integer getFirst()
    static void setSame(Pair<? super Integer> p,Integer i){
        p.setFirst(i);
        p.setLast(i);
    }
}



class Pair<T> {
    private T first;
    private T last;

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setLast(T last) {
        this.last = last;
    }
}