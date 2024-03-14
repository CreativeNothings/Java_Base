import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //输入
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT YOUR NAME");
        String name = sc.nextLine();//读取一行输入并获取字符串
        System.out.print("INPUT YOUR AGE");
        int age = sc.nextInt();//读取一行输入并获取整数
        System.out.printf("Hi,%d岁的%s.",age,name);

    }
}