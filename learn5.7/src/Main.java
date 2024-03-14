public class Main {
    public static void main(String[] args) {

        //枚举类
        //为了让编译器能自动检查某个值在枚举的集合内，并且，
        // 不同用途的枚举需要不同的类型来标记，不能混用，
        // 我们可以使用enum来定义枚举类

        //定义的enum类型总是继承自java.lang.Enum，且无法被继承；
        //只能定义出enum的实例，而无法通过new操作符创建enum的实例；
        //定义的每个实例都是引用类型的唯一实例；
        //可以将enum类型用于switch语句
        Weekday day = Weekday.SUN;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("work at home");
        } else {
            System.out.println("work at office");
        }

        String s = Weekday.SUN.name();
        System.out.println(s);

        int i = Weekday.SAT.ordinal();

    }
}

enum Weekday {
    SUN(0, "日"),
    MON(1, "一"),
    TUE(2, "二"),
    WED(3, "三"),
    THU(4, "四"),
    FRI(5, "五"),
    SAT(6, "六");

    public final int dayValue;
    public final String chinese;

    private Weekday(int dayValue, String chinese) {
        this.dayValue = dayValue;
        this.chinese = chinese;
    }
    public String toString(){
        return this.chinese;
    }
}