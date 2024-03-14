public class Main {
    public static void main(String[] args) {

        //为了能追踪到完整的异常栈，在构造异常的时候，
        // 把原始的Exception实例传进去，
        // 新的Exception就可以持有原始Exception信息。
        try{
            process1();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    static void process1(){
        try{
            process2();
        }catch (NullPointerException e){
            throw new IllegalArgumentException(e);
        }
    }
    static void process2(){
        throw new NullPointerException();
    }
}