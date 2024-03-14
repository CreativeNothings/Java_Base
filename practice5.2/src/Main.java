public class Main {
    public static void main(String[] args) {

        //练习
        //请使用StringBuilder构造一个INSERT语句：
        String[] fields = {"name", "position", "salary"};
        String table = "employee";
        String insert = bulidInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name,position,salary) VALUES (?,?,?)";
        System.out.println(s.equals(insert) ? "yes" : "no");

    }

    static String bulidInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append("INSERT INTO ");
        sb.append(table);
        String[] f = fields.clone();
        sb.append(" (");
        for (int i = 0; i <= f.length - 1; i++) {
            if (i != f.length - 1) {
                sb.append(f[i]);
                sb.append(",");
            } else {
                sb.append(f[i]);
            }
        }
        sb.append(") VALUES (?,?,?)");
        return sb.toString();
    }
}