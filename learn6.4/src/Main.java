public class Main {
    public static void main(String[] args) throws Exception {

        //异常屏蔽 finally在抛出异常后，catch的异常没有机会被抛出
        Exception origin = null;
        try{
            System.out.println(Integer.parseInt("abc"));
        }catch(Exception e){
            origin = e;
            throw e;
        }finally {
            Exception e = new IllegalArgumentException();
            if(origin!=null){
                e.addSuppressed(origin);
            }
            throw e;
        }
    }
}