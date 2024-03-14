public class Main {
    public static void main(String[] args) {

        //抽象类
        //因为抽象类本身被设计成只能用于被继承，
        // 因此，抽象类可以强迫子类实现其定义的抽象方法，
        // 否则编译会报错。
        // 因此，抽象方法实际上相当于定义了“规范”。
        Income[] incomes = new Income[]{new Salary(7500),new Royalty(12000)};
        double total = 0;
        for(Income income:incomes){
            total = total+income.getTax();
        }
        System.out.println(total);
    }
}
 abstract class Income{
    protected double income;
    public abstract double getTax();

     public Income(double income) {
         this.income = income;
     }
 }

 class Salary extends Income{
    public Salary(double income){
        super(income);
    }

    public double getTax(){
        if(income<=5000){
            return 0;
        }else{
            return (income-5000)*0.2;
        }

    }
 }

 class Royalty extends Income{
    public Royalty(double income){
        super(income);
    }
    @Override
     public double getTax(){
        return income*0.1;
    }
 }