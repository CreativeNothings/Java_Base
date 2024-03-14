public class Main {
    public static void main(String[] args) {

        //练习2
        //利用for each循环对数组每个元素求和：
        int[] ns = { 1, 4, 9, 16, 25 };
        int sum = 0;
        for (int n : ns) {
            // TODO
            sum=sum+n;
        }
        System.out.println(sum); // 55

    }
}