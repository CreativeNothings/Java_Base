public class Main {
    public static void main(String[] args) {
        //练习
        //用接口给一个有工资收入和稿费收入的小伙伴算税。
        Income[] incomes = {new SalaryIncome(7500),new RoyaltyIncome(10000)};
        System.out.println(totalTax(incomes));
    }
    public static double totalTax(Income[] incomes){
        double total = 0;
        for(Income income:incomes){
            total+=income.getTax();
        }
        return total;
    }
}

interface Income{
    double getTax();
}

class SalaryIncome implements Income{
    private double salary;
    public SalaryIncome(double salary){
        this.salary =salary;
    }
    public double getTax(){
        if(salary<=5000){
            return 0;
        }else{
            return (salary-5000)*0.1;
        }
    }
}

class RoyaltyIncome implements Income{
    private double royalty;
    public RoyaltyIncome(double royalty){
        this.royalty = royalty;
    }
    public double getTax(){
        return royalty*0.2;
    }
}