import javax.print.DocFlavor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //字符串和编码
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);
        //上段表示字符串内容不可变
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("hello".contains("ll"));
        System.out.println("hello".substring(2));
        System.out.println("hello".substring(2,4));

        //去除首尾空白字符
        System.out.println("\t\nhello\r\n".trim());

        //替换子串
        String s3 = "hello";
        s.replace('l','w');
        s.replace("ll","ss");
        String s4 = "A,B,C,D";
        s.replaceAll("[\\,\\;\\s]+",",");

        //分割字符串
        String[] ss = s4.split("\\,");
        System.out.println(Arrays.toString(ss));

        //格式化
        String s5 = "hi %s,your score is %d";
        //System.out.println(s5.formatted("alice",80));
        System.out.println(String.format("hi %s,your score is %.2f","bob",59.5));

        //类型转换
        String.valueOf(123);
        String.valueOf(45.67);
        String.valueOf(true);
        int n1 = Integer.parseInt("123");
        int n2 = Integer.parseInt("ff",16);

        //String->char[]
        char[] cs = "hello".toCharArray();
        String s6 = new String(cs);
        System.out.println(s6);
        System.out.println(Arrays.toString(cs));
        cs[0] = 'X';
        System.out.println(s6);
        System.out.println(Arrays.toString(cs));
        //这是因为通过new String(char[])创建新的String实例时，
        // 它并不会直接引用传入的char[]数组，而是会复制一份，
        // 所以，修改外部的char[]数组不会影响String实例内部的char[]数组，
        // 因为这是两个不同的数组。


    }
}