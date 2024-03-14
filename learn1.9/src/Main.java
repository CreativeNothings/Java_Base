public class Main {
    public static void main(String[] args) {

        //类型自动提升与强制转型
        short s = 1234;
        int i = 123456;
        //int s + i;  1.8不能
        int i1 = 1234567;
        short s1 = (short)i1;
        System.out.println(s1);//=-10617

    }
}