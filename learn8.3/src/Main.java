import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}
@Retention(RetentionPolicy.RUNTIME)
@interface Colors{
    Color[] value();
}

@Repeatable(Colors.class)
@interface Color{
    String name();
}

@Color(name="red")
@Color(name="green")
@Color(name="blue")
class Shirt{

}