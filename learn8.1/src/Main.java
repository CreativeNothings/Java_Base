import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class Main {
    public static void main(String[] args) {

        //使用注解
    }
}

//@Resource("hello")
class Hello{
    //@Inject
    int n;

    @PostConstruct
    void hello(/*@Param*/ String name){
        System.out.println(name);
    }

    @Override
    public String toString(){
        return "Hello";
    }
}