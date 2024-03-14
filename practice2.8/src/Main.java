public class Main {
    public static void main(String[] args) {

       //圆周率π可以使用公式计算,请利用for循环计算π
        double pi = 0;
        boolean flag =true;
        for(int i=1;i<=1000;i=i+2){
            if(flag){
                pi = pi+1.0/(double)i;
            }else {
                pi = pi-1.0/(double)i;
            }
            flag = !flag;
        }
        System.out.printf("pi : %f",pi*4);
    }
}