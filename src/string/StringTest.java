package string;

import org.junit.Test;

/**
 * @author wqh
 * @date 18-10-15
 */
public class StringTest {
    @Test
    public void contact(){
        String a = "a";
        String b = "a";
        String c = a + "a";
        String d = "a" + "a";
        String e = a + b;
        /*
         * 常量是通过编译器进行的计算，有变量是运行期进行的计算
         * */
        /*false */
        System.out.println(c == d);
        /*false */
        System.out.println(c == e);
        /*true */
        System.out.println(d == "aa");
    }

    @Test
    public void intern(){
        String s1 = "a";
        /*
        * new String是在堆中创建的,将引用赋给栈中的s2,直接赋值是在字符串常量池中.
        * intern方法 如果池中已经包含一个字符串相等这String对象由equals(Object)
        * 方法确定，然后从池中的字符串返回。否则，这String对象添加到池中，将这个String对象返回。
        * */
        String s2 = new String( "a");
        String intern = s2.intern();
        String intern1 = s1.intern();
        /*true*/
        System.out.println(intern==intern1);
        /*false*/
        System.out.println(s2==intern);
        /*false*/
        System.out.println(s2==intern1);
        /*true*/
        System.out.println(s1==intern1);
        /*true*/
        System.out.println(s1==intern);
    }

}
