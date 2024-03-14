public class Main {
    public static void main(String[] args) {

        //参数绑定
        Person p = new Person();
        String bob = "Bob";
        p.setName(bob);
        bob = "alice";
        System.out.println(p.getName());
    }

}
class Person{
private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;

    }
}