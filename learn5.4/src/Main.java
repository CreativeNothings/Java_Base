public class Main {
    public static void main(String[] args) {

        //包装类型
        //数据类型：基本、引用
        //我们可以定义一个Integer类，它只包含一个实例字段int，
        // 这样，Integer类就可以视为int的包装类（Wrapper Class）
        Integer n = null;
        Integer n2 = new Integer(99);
        int n3 = n2.intValue();
    }
}

public class Integer{
    private int value;
    public Integer(int value){
        this.value = value;
    }
    public int intValue(){
        return value;
    }
}