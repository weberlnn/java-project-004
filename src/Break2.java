/**
 * Created by lin on 2016/7/28.
 */
//break语句可以用在java的任何循环中，包括有意设置的无限循环。
public class Break2 {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        for( ; ; ) {
            ch = (char) System.in.read();
            if(ch == 'q') break;
        }
        System.out.println("你按下q!");
    }
}
