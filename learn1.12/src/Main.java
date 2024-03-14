public class Main {
    public static void main(String[] args) {

        //字符串不可变
        //引用类型的指向有关
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t);
        //区分空字符串 "" 和 null 的区别
        String s1 = "";
        String s2 = null;
    }
}