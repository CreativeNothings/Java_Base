public class Main {
    public static void main(String[] args) {

        //判断引用类型相等
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        if(s1 !=null && s1.equals(s2)){
            System.out.println("==");
        }else{
            System.out.println("!=");
        }
    }
}