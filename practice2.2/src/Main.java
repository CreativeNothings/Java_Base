import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //练习
        //请用if ... else编写一个程序，用于计算体质指数BMI，并打印结果
        //BMI = 体重(kg)除以身高(m)的平方
        //BMI结果：
        //过轻：低于18.5
        //正常：18.5-25
        //过重：25-28
        //肥胖：28-32
        //非常肥胖：高于32
        Scanner sc = new Scanner(System.in);
        System.out.print("input your weight(kg):");
        double weight = sc.nextDouble();
        System.out.print("input your height(m):");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.printf("your BMI is %.2f\n",BMI);
        if(BMI>=32){
            System.out.println("too fat");
        }else if(BMI>=28){
            System.out.println("fat");
        }else if(BMI>=25){
            System.out.println("little fat");
        }else if(BMI>=18.5){
            System.out.println("format");
        }else{
            System.out.println("light weight");
        }


    }
}