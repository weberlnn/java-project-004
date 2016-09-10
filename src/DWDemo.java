/**
 * Created by lin on 2016/7/28.
 */
/*尽管只有一条语句时并不是一定要使用花括号，但是为了提高do-while结构的可读性，常常会使用它，
这样就可以防止与while相混浊。只要条件表达式为真，就会执行do-while循环。
 */
public class DWDemo {
    public static void main(String args[])
        throws java.io.IOException {

            char ch;

            do {
                System.out.println("按下一个键之后按 ENTER: ");
                ch = (char) System.in.read();
        } while (ch != 'q');//直到用户输入字母q。
    }
}
