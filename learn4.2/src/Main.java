public class Main {
    public static void main(String[] args) {

       //method
        Person ming = new Person();
        ming.setBirth(2000);
        System.out.println(ming.getAge());

    }

}

class Person{
    private String name;
    private int age;
    private int birth;

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return calcAge(2023);
    }

    public void setAge(int age) {
        if(age<0||age>110){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
    private int calcAge(int currentYear){
        return currentYear-this.birth;
    }
}