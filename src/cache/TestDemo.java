package cache;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * @author wqh
 * @date 18-10-14
 */
public class TestDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int nextInt = random.nextInt(3);
        System.out.println(nextInt);
    }
    private static void  swap(Integer a,Integer b){
        int temp = a;
        try {
            Field value = Integer.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set(a,b);
            /*
            * 第一种和第二种
            * */
            value.set(b,temp);
            System.out.println();
            value.set(b,new Integer(temp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
