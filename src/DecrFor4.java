/**
 * Created by lin on 2016/8/1.
 */
public class DecrFor4 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch=0;
        int num=0;

        for (; ; ) {
            try {
                ch = (char) System.in.read();
            }
            catch(Exception e){
                System.out.checkError();
            }
            if (ch == '.') {
                break;
            }
            if (ch == ' ') {
                num++;
            }
        }
        System.out.println(num);
    }
}
