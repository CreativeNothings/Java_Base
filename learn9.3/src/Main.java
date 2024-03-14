import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //编写泛型
        AllName[] allName = {new AllName("jack", "davy"),
                new AllName("lee", "monkey"),
                new AllName("jack", "frank")};
        Arrays.sort(allName);
        //System.out.println(Arrays.toString(allName));
        for(AllName n:allName){
            System.out.println(n.getAllName());
        }
    }
}


class AllName implements Comparable<AllName> {
    String fname;//first
    String lname;//last

    public AllName(String f, String l) {
        this.fname = f;
        this.lname = l;
    }

    public String getAllName() {
        return fname +" "+ lname;
    }

    @Override
    public String toString() {
        return
                "firstname='" + fname + '\'' +
                        ", lastname='" + lname + '\'' +
                        '}';
    }

    public int compareTo(AllName other) {
        if (this.fname.compareTo(other.fname) == 0) {
            return this.lname.compareTo(other.lname);
        } else {
            return this.fname.compareTo(other.fname);
        }
    }

}