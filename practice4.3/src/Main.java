public class Main {
    public static void main(String[] args) {

        // TODO: 给Person增加重载方法setName(String, String):
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("Ming");
        hong.setName("xiao","hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
class Person{
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setName(String lastname,String formername){
        this.name = lastname+formername;
    }
}