public class Main {
    public static void main(String[] args) {

        //练习
        //使用do while循环计算从m到n的和。
        int m= 1;
        int n = 100;
        int start = m;
        int sum = 0;
        do{
            sum = sum+start;
            start++;
        }while (n>=m&&start<=n);
        System.out.println(sum);
    }
}