public class Main {
    public static void main(String[] args) {

        //字符和字符串
        char c = 'S';
        char c1 = '算';
        //char 和 int 类型 都是2字节，也有int c = 'A'; c = 65
        String s = "你好";
        String s1 = "abcdefg";
        //双引号转义
        String s2 = "abc\"xyz";

        String string1 = "hello";
        String string2 = "world";
        String string3 = string1 +string2;
        System.out.println(string3);

    }
}