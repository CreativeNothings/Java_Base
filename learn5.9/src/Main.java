import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        //biginteger 大整数
        BigInteger bi = new BigInteger("1234567890");
        BigInteger i1 = new BigInteger("123456789023456789");
        BigInteger sum = bi.add(i1);
        System.out.println(bi.longValue());

        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println("超级大数："+f);
        //bigdecimal 大浮点数

        BigDecimal bd = new BigDecimal("123.123456");
        //BigDecimal用scale()表示小数位数
        System.out.println(bd.scale());

        BigDecimal bd1 = new BigDecimal("123.45000");
        BigDecimal bd2 = bd1.stripTrailingZeros();
        System.out.println(bd1.scale());
        System.out.println(bd2.scale());


        BigDecimal d1 = new BigDecimal("123.456");
        BigDecimal d2 = new BigDecimal("23.4567");
        BigDecimal d3 = d1.divide(d2,10, RoundingMode.DOWN);

        BigDecimal n1 = new BigDecimal("12.345");
        BigDecimal m = new BigDecimal("0.12");
        BigDecimal[] dr = n1.divideAndRemainder(m);
        System.out.println(dr[0]);//只有0（商）和1（余数）

        //在比较两个BigDecimal的值是否相等时，要特别注意，
        // 使用equals()方法不但要求两个BigDecimal的值相等，
        // 还要求它们的scale()相等：
        //必须使用compareTo()方法来比较



    }
}