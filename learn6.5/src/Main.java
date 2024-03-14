import java.util.Scanner;

public class Main {
    public static final String ROOT = "admin";
    public static final String PASSWORD ="password";
    public static void main(String[] args) {

        //自定义异常
        String inputRoot;
        String inputPassword;
        Scanner sc = new Scanner(System.in);
        inputRoot = sc.nextLine();
        inputPassword = sc.nextLine();
        if(inputRoot.equals(ROOT)||inputPassword.equals(PASSWORD)){

        }else {
            throw new BaseException("账号或密码错误");
        }


    }
}


class BaseException extends RuntimeException {
    public BaseException() {
        super();
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(String s){
        super(s);
    }
}