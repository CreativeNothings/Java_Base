import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

       //使用PriorityQueue
        Queue<String> q = new PriorityQueue<>();//String 实现了comparable
        q.offer("apple");
        q.offer("pear");
        q.offer("banana");
        System.out.println(q.poll()); // apple
        System.out.println(q.poll()); // banana
        System.out.println(q.poll()); // pear
        System.out.println(q.poll()); // null,因为队列为空
        Queue<User> q1 = new PriorityQueue<>(new UserComparator());
        q1.offer(new User("Bob", "A1"));
        q1.offer(new User("Alice", "A2"));
        q1.offer(new User("Boss", "V1"));
        System.out.println(q1.poll()); // Boss/V1
        System.out.println(q1.poll()); // Bob/A1
        System.out.println(q1.poll()); // Alice/A2
        System.out.println(q1.poll()); // null,因为队列为空
    }
}

class UserComparator implements Comparator<User>{
    public int compare(User u1,User u2){
        if(u1.level.charAt(0)==u2.level.charAt(0)){
            return u1.level.compareTo(u2.level);
        }
        if(u1.level.charAt(0)=='V'){
            return -1;
        }else{
            return 1;
        }
    }
}
class User{
    public String name;
    public final String level;

   public User(String name,String level) {
       this.name =name;
        this.level = level;
    }
    public String toString(){
       return name+"/"+level;
    }
}