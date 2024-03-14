public class Main {
    public static void main(String[] args) {

        //switch多重选择
        int option = 3;
        switch(option){
            case 1:
                System.out.println("SELECTED 1");
                break;
            case 2:
                System.out.println("SELECTED 2");
                break;
            case 3:
            case 4:
                System.out.println("select 3,4");
                break;
            default:
                System.out.println("not selected");
                break;
        }
    }
}