import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //用栈实现10转换16进制
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("输入待转换整数（十进制）：");
        num = sc.nextInt();
        Deque<Character> stack = new LinkedList<>();

        int temp = num;
        while (temp >= 16) {
            int reminder = temp % 16;
            switch (reminder) {
                case 0:
                    stack.push('0');
                    break;
                case 1:
                    stack.push('1');
                    break;
                case 2:
                    stack.push('2');
                    break;
                case 3:
                    stack.push('3');
                    break;
                case 4:
                    stack.push('4');
                    break;
                case 5:
                    stack.push('5');
                    break;
                case 6:
                    stack.push('6');
                    break;
                case 7:
                    stack.push('7');
                    break;
                case 8:
                    stack.push('8');
                    break;
                case 9:
                    stack.push('9');
                    break;
                case 10:
                    stack.push('A');
                    break;
                case 11:
                    stack.push('B');
                    break;
                case 12:
                    stack.push('C');
                    break;
                case 13:
                    stack.push('D');
                    break;
                case 14:
                    stack.push('E');
                    break;
                case 15:
                    stack.push('F');
                    break;
            }
            temp = temp / 16;
        }
        stack.push(Character.forDigit(temp, 10));
        System.out.print("\n输入的10进制数：" + num + "转换为16进制为：0x");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}