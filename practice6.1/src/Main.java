public class Main {
    public static void main(String[] args) {
        try{
            process(-20);
        }catch (Exception e){
            System.out.println(e);
        }

    }
    static void process(int i){
        if(i<=0){
            throw new IllegalArgumentException();
        }
    }
}