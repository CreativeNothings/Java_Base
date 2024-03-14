public class Main {
    public static void main(String[] args) {

        //练习
        //使用二维数组可以表示一组学生的各科成绩，请计算所有学生的平均分
        // 用二维数组表示的学生成绩:
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        double average = 0;
        for(int[] arr:scores){
            for (int n:arr){
                average = average+n;
            }
        }
        average = average/(double) 15;
        System.out.println(average);
    }
}