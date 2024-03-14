public class Main {
    public static void main(String[] args) {

        //StringBuilder
        //字符串拼接
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1000; i++) {
            sb.append(',');
            sb.append(i);
        }
        String s = sb.toString();

        StringBuilder sb1 = new StringBuilder(1024);
        sb1.append("mr")
                .append("BOB")
                .append("!")
                .insert(0, "hello,");
        System.out.println(sb1.toString());
    }
}