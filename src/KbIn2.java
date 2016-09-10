/**
 * Created by lin on 2016/7/30.
 */
public class KbIn2 {
    public static void main(String args[])
        throws java.io.IOException{
        char ch;
        for(; ;){

            ch = (char) System.in.read();
            if(ch == '.')break;
            ch++;
        }
        System.out.println(" ");
    }
}
