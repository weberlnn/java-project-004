/**
 * Created by lin on 2016/7/24.
 */
public class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 'K';
        //以为使用了System.in.read(),所以程序必须指定throws java.io.IOException语句。
        //这一行代码是处理输入错误所必需的。
        System.out.println("我思考一个A到Z之间的一个字母.");
        System.out.print("你能猜到它: ");

        ch = (char) System.in.read();

        if(ch == answer) System.out.println("** 正确的 **");
        else {
            System.out.print("...对不起，你 ");
            //一个嵌套的如果。
            if(ch < answer) System.out.println("太低了");
            else System.out.println("太高了");
        }
    }
}
