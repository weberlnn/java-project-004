/**
 * Created by lin on 2016/7/28.
 */
//我们可以使用do-while循环，进一步改善本章前面介绍的猜字母游戏程序。
public class Guess4 {//程序将会不断循环，直到你猜到字母为止。
    public static void main(String args[])
        throws java.io.IOException{
        char ch, ignore, answer = 'K';
        do{  //第一个循环一直执行，直到用户猜对了字母
            System.out.println("我在考虑一个A到Z之间的字母。 ");
            System.out.print("你能猜到它: " );
            //读取一个字符。
            ch = (char) System.in.read();
            //丢弃任何其它字符的输入缓冲区。
            do{
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            if(ch == answer) System.out.println("** 正确的 **");
            else {
                System.out.println("...对不起，你");
                if(ch < answer) System.out.println("太低了");
                else System.out.println("太高了");
                System.out.println("再试一次！\n");
            }
        }while(answer != ch);
    }
}
