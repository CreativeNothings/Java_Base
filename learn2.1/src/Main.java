public class Main {
    public static void main(String[] args) {
        System.out.print("A,");
        System.out.print("B,");
        System.out.print("C.");
        System.out.println();
        System.out.println("END");
        //格式化输出printf( % 是占位符，需传入对应参数)
        double d = 12900000;
        System.out.println(d);
        double d1 = 3.1415926;
        System.out.printf("%.2f\n",d1);
        System.out.printf("%.4f\n",d1);

        int n = 12345000;
        System.out.printf("n = %d\nhex = %08x",n,n);
    }
}