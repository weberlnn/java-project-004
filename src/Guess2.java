/**
 * Created by lin on 2016/7/24.
 */
//如果条件表达式为真，那么执行if的目标；否则，退出if，去执行else的目标。
    //两个目标是不能同时执行的。控制if语句的条件表达式必须生成一个boolean结果。
public class Guess2 {
    public static void main(String args[])
        throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("我思考一个关于A到Z之间的字母");
        System.out.println("你能猜到它：");

        ch = (char) System.in.read();//得到一个字符。

        if(ch == answer) System.out.println("** 正确的 **");
        else System.out.println("...对不起，你错了.");
    }
}
