/**
 * Created by lin on 2016/7/24.
 */
//从键盘读取一个字符。
public class KbIn {
    public static void main(String args[])
            throws java.io.IOException{

        char ch;
        System.out.println("按下一个键之后输入： ");

        ch = (char) System.in.read();//得到一个字符。
        //因为使用了System.in.read(),所以程序必须指定throws java.io.IOException语句。
        //这一行代码是处理输入错误所必须的。
        System.out.println("你输入的键是: " + ch);
    }
}
