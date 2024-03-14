public class Main {
    public static void main(String[] args) {

        //数组类型
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        System.out.println("在总计" + ns.length + "位同学中，第2位同学得分是" + ns[1]);
        //“指向”
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
        //数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
        //数组一旦创建后，大小就不可改变。

    }
}le'a