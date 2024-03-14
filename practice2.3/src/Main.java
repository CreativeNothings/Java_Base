import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //练习
        //使用switch实现一个简单的石头、剪子、布游戏
        String player1 = "剪刀";
        Scanner sc = new Scanner(System.in);
        System.out.print("出（剪刀、石头、布）");
        String player2 = sc.nextLine();
        switch (player2){
            case "剪刀":
                System.out.println("平局");
                break;
            case "石头":
                System.out.println("赢了");
                break;
            case "布":
                System.out.println("输了");
                break;
            default:
                System.out.println("你出的什么玩意！");
                break;

        }
    }
}