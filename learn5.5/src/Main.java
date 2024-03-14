public class Main {
    public static void main(String[] args) {

       int n = 100;
       Integer n1 = new Integer(100);
       Integer n2 = Integer.valueOf(100);
       Integer n3 = Integer.valueOf("100");
       System.out.println(n3.intValue());

       //进制转换
        int x1 = Integer.parseInt("100");//parse：解析
        int x2 = Integer.parseInt("100",16);
        System.out.println(Integer.toString(100));
        System.out.println(Integer.toString(100,18));
        System.out.println(Integer.toBinaryString(100));

        //处理无符号整型
        byte x = -1;
        byte y = 127;
        System.out.println(Byte.toUnsignedInt(x));
        System.out.println(Byte.toUnsignedInt(y));
    }
}