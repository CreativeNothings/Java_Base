public class Main {
    public static void main(String[] args) {

        //抛出异常
        try{
            process1();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    static void process1(){
        process2();

    }

    static void process2(){
        Integer.parseInt(null);
    }
}