import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //进阶练习：
        //
        //请利用Stack把字符串中缀表达式编译为后缀表达式，然后再利用栈执行后缀表达式获得计算结果：
        String exp = "1+2*(9-5)";
        Queue<Character> numbers = new LinkedList<>();
        Deque<Character> operators = new LinkedList<>();
        int s = exp.length();
        char[] expchar = exp.toCharArray();
        for (int i = 0; i < s; i++) {
            if (expchar[i] >= '0' && expchar[i] <= '9') {
                //是数字，放入numbers stack
                numbers.offer(expchar[i]);
            } else {//是运算符
                if (expchar[i] != '(' && expchar[i] != ')') operators.push(expchar[i]);
            }
        }
        while (!operators.isEmpty()) {
            numbers.offer(operators.pop());
        }
        //下方代码测试异常，查看字符输入是否正常
//        while(!numbers.isEmpty()){
//         System.out.print( numbers.poll()+",");
//      }
        //首先准备一个空的栈
        Deque<Character> calculate = new LinkedList<>();
        while (!numbers.isEmpty()) {
            if (numbers.poll() >= '0' && numbers.poll() <= '9') {
                calculate.push(numbers.poll());
            } else {
                int a, b;
                switch (numbers.poll()) {//Exception :null pointer
                    case '+': {
                        a = Character.forDigit(calculate.poll(), 10);
                        b = Character.forDigit(calculate.poll(), 10);
                        calculate.push((char) (a + b));
                        break;
                    }
                    case '-':{
                        a = Character.forDigit(calculate.poll(), 10);
                        b = Character.forDigit(calculate.poll(), 10);
                        calculate.push((char) (a-b));
                        break;
                    }
                    case '*':{
                        a = Character.forDigit(calculate.poll(), 10);
                        b = Character.forDigit(calculate.poll(), 10);
                        calculate.push((char) (a*b));
                        break;
                    }
                    case '/':{
                        a = Character.forDigit(calculate.poll(), 10);
                        b = Character.forDigit(calculate.poll(), 10);
                        calculate.push((char) (a/b));
                        break;
                    }
                }
            }

        }
        char result = calculate.poll();
        System.out.print(result);
    }
}