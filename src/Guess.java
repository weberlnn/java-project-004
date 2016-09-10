/**
 * Created by lin on 2016/7/24.
 */
public class Guess {
    public static void main(String args[])
        throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("I'm thinking of a letter between A and Z. ");
        System.out.print("Can you guess it：");
        ch = (char) System.in.read();
        if (ch==answer) System.out.println("** Right **");
        //程序首先提示玩家，然后从键盘读取字符。
        //它使用一个if语句检查字符与答案是否一致，本例中答案为K，那么就显示那个消息。
    }
}
