import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


//       //捕获异常
//        byte[] bs =toGBK("中文");
//        System.out.println(Arrays.toString(bs));
//    }
//    static byte[] toGBK(String s){
//        try{
//            // 用指定编码转换String为byte[]:
//            return s.getBytes("GBK");
//        }catch (UnsupportedEncodingException e){
//            // 如果系统不支持GBK编码，会捕获到UnsupportedEncodingException:
//            System.out.println(e);
                //e.printStackTrace();
//            return s.getBytes();
//        }
        try{
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));}catch (UnsupportedEncodingException e){
            System.out.println(e);
        }

    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        return s.getBytes("GBK");

    }
}//所有异常都可以调用printStackTrace()方法打印异常栈，
// 这是一个简单有用的快速打印异常的方法。