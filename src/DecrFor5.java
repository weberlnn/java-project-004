/**
 * Created by lin on 2016/8/1.
 */
public class DecrFor5 {
    public static void main(String args[])
            throws java.io.IOException {
        int num=0;
        for (; ; ) {
            byte ch = (byte) System.in.read();
            int newCh = ch;
            if(ch >=97 && ch <=122) {
                newCh = ch-32;
                num++;
            }

            if(ch >=65 && ch <= 90) {
                newCh = ch+32;
                num++;
            }
            if(ch == '.'){
                break;
            }
            System.out.print((char)newCh);
        }
       System.out.println(num);
    }
}
