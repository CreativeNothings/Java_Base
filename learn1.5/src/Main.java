public class Main {
    public static void main(String[] args) {

        int n = 100;
        System.out.println("n=" + n);//100
        n = 200;
        System.out.println("n=" + n);//200
        int x = n;
        System.out.println("x=" + x);//200
        x =x+100;
        System.out.println("x=" + x);//300

    }
}