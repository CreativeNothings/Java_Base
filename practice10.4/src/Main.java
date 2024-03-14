import java.util.*;

public class Main {
    public static void main(String[] args) {

       List<Message> messageList = new ArrayList<>();
       messageList.add(new Message("01",1));
        messageList.add(new Message("01",1));
        messageList.add(new Message("02",2));
        messageList.add(new Message("03",3));
        messageList.add(new Message("03",3));
        Set<Message> set = new TreeSet<>();
        for(Iterator<Message> m = messageList.iterator();m.hasNext();){
            Message message = m.next();
            set.add(message);
        }
        for(Message m:set){
            System.out.println(m.message+" Time:"+m.sendTime);
        }
    }
}

class Message implements Comparable{
  public String message;
  final int sendTime;

   public Message(String message,int sendTime) {
        this.message = message;
        this.sendTime = sendTime;
    }

    public int compareTo(Object o){
       int re=0;
       if(o instanceof Message){
           Message m = (Message) o;
           if(this.sendTime>m.sendTime){
               re = 1;
           } else if (this.sendTime==m.sendTime) {
               re= 0;

           }else {
               re= -1;
           }
       }
       return re;
    }
}