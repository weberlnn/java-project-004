/**
 * Created by lin on 2016/7/26.
 */
//for循环的一些变体。
//控制循环条件可以是任何有效的Boolean类型的表达式。它不一定要与循环控制变量有关。
public class ForTest {
    public static void main(String args[])
        throws java.io.IOException{//处理输入错误所必需的。
        int i;
        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() !='S'; i++)
            System.out.println("Pass #" + i);
        //下面的实例中，循环会一直进行，直到用户用键盘输入字母S为止。
    }
}
