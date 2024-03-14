import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

       //StringJoiner:用分隔符拼接数组的需求
        String[] name = {"bob","ailce","dave"};
//        StringBuilder sb = new StringBuilder();
//        sb.append("hello ");
//        for (String s : name) {
//            sb.append(s).append(",");
//        }
//        sb.delete(sb.length()-1,sb.length());//int start ,int end
//        sb.append("!");
//        System.out.println(sb.toString());
        StringJoiner sj = new StringJoiner(",");

        StringJoiner sj1 = new StringJoiner(",","hello ","!");

        for(String s:name){
            sj.add(s);
            sj1.add(s);
        }
        System.out.println(sj.toString());
        System.out.println(sj1.toString());
        //静态join
        String s = String.join(",",name);
        System.out.println(s);
    }
}