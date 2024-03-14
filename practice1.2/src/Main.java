public class Main {
    public static void main(String[] args) {

        //根据一元二次方程
        // ax*x+bx+c=0的求根公式
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        double r1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
        double r2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
}