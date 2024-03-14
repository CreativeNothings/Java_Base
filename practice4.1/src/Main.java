class City{
    public String name;
    public double latitude;
    public double longitude;
}

public class Main {
    public static void main(String[] args)
    {
        City beijing =new City();
        beijing.name = "BeiJing";
        beijing.latitude = 39.903;
        beijing.longitude = 116.401;
        System.out.println(beijing.name);
        System.out.println("location:("+beijing.latitude+","+beijing.longitude+")");
    }
}