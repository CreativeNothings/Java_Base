import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //练习
        //请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），
        // 然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
        Scanner sc = new Scanner(System.in);
        System.out.print("input last exam score:");
        int i1 = sc.nextInt();
        System.out.print("input this exam score:");
        int i2 = sc.nextInt();
        double percent;
        percent = ((double)(i2-i1)/(double)i1)*100;
        System.out.printf("小明上次成绩%d,这次成绩%d,成绩提高百分比为%.2f%%",i1,i2,percent);

    }
}