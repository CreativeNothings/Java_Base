public class Main {
    public static void main(String[] args) {

        //仿照StringBulider 的append 链式操作的
        // 一个可以不断增加的计数器
        Adder adder = new Adder();
        adder.add(3)
                .add(5)
                .inc()
                .add(10);
        System.out.println(adder.value());


    }
}

class Adder{
    private int sum =0;
    public Adder add(int n){
        sum = sum+n;
        return this;
    }
    public Adder inc(){
        sum++;
        return this;
    }

    public int value(){
        return sum;
    }
}