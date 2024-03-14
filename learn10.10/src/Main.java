import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
       //
       // throw Exception	返回false或null
        // 添加元素到队尾	add(E e)	boolean offer(E e)
        //取队首元素并删除	E remove()	E poll()
        //取队首元素但不删除	E element()	E peek()
        Queue<String> q = new LinkedList<>();
        q.offer("apple");
        q.offer("banana");
        q.offer("pear");
//        //对比poll(取出并且删除)和peek（取出但不删除）
//        System.out.println(q.peek());
//        System.out.println(q.peek());

//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.element());
    }
}