import java.util.*;

public class Main {
    public static void main(String[] args) {

        //学习中缀转后缀并运算
        String exp = "x + 2 * (y - 5)";
        SuffixExpression se = compile(exp);
        Map<String, Integer> env = new HashMap<>();
        env.put("x",1);
        env.put("y",9);
        int result = se.execute(env);
        System.out.println(env);
        System.out.println(exp + " = " + result + " " + (result == 1 + 2 * (9 - 5) ? "correct" : "wrong"));

    }
    static SuffixExpression compile(String exp){
        SuffixExpression suffe = new SuffixExpression();
        char[] expArray = exp.toCharArray();
        for(Character c : expArray){
            if(c == ' '){
                continue;
            }else if(isChar(c)){ //is a number or a char
                suffe.queue.add(c);
            }else if(c == '('){ // is a '('
                suffe.stack.push(c);
            }else if(c == ')'){ // is a ')'
                while(suffe.stack.peek() != '('){
                    if(suffe.stack.peek() != null){
                        suffe.queue.add(suffe.stack.pop());
                    }else{
                        throw new RuntimeException("error for the absence of '('");
                    }
                }
                suffe.stack.pop();
            }else{ // is an operator, need to consider about the priority of those ops: + , - , * , /
                if (suffe.stack.isEmpty()){
                    suffe.stack.push(c);
                    continue;
                }
                while (!suffe.stack.isEmpty()){ // if stack is not empty
                    if(suffe.stack.peek().equals('(')){
                        suffe.stack.push(c);
                        break;
                    }else if(precedence(c) <= precedence(suffe.stack.peek())){ // the top of the stack is not '(' and the priority is greater than the current operator
                        suffe.queue.add(suffe.stack.pop());
                    }else{
                        suffe.stack.push(c);
                        break;
                    }
                }

            }
        }
        while(!suffe.stack.isEmpty()){
            suffe.queue.add(suffe.stack.pop());
        }
        return suffe;
    }

    public static boolean isChar(Character a) {
        return (a >= 'a' && a <= 'z') || (a > '1' && a < '9');
    }
    public static int precedence(Character operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
}

class SuffixExpression{
    //use a stack and a queue to store the info of the expression
    public Deque<Character> stack;
    public Queue<Character> queue;

    public SuffixExpression(){
        stack = new LinkedList<>();
        queue = new LinkedList<>();
    }
    int execute(Map<String,Integer> env){
        // first we need a int stack to help us calculate the answer
        Deque<Integer> helpIntegers  =new LinkedList<>();
        while(!this.queue.isEmpty()){
            Character c = this.queue.remove();
            if(Main.isChar(c)){
                helpIntegers.push(env.get(c.toString()) != null ? env.get(c.toString()) : Integer.parseInt(c.toString()));
            }else{
                Integer a = helpIntegers.pop();
                Integer b = helpIntegers.pop();
                switch (c){
                    case '+':
                        helpIntegers.push(a + b);
                        break;
                    case '-':
                        helpIntegers.push(b - a);
                        break;
                    case '*':
                        helpIntegers.push(a * b);
                        break;
                    case '/':
                        helpIntegers.push(b / a);
                        break;
            }
        }
    }
        int ans = helpIntegers.pop();
        return ans;
}}