import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        //序列化
        //实现Serializable(标记接口)，里面没任何方法
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try(ObjectOutputStream output = new ObjectOutputStream(buffer)){
            output.writeInt(12345);
            output.writeUTF("Hello");
            output.writeObject(Double.valueOf(12.34));
        }
        System.out.println(Arrays.toString(buffer.toByteArray()));
    }
}