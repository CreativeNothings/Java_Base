import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //练习
        //使用while计算从m到n的和：
        Scanner sc = new Scanner(System.in);
        System.out.print("input m:");
        int m = sc.nextInt();
        System.out.print("input n:");
        int n = sc.nextInt();
        int start = m;
        int sum = 0;
        while(n>=m && start<=n){
            sum = sum+start;
            start++;
        }
        System.out.printf("m-n :%d",sum);
    }
}