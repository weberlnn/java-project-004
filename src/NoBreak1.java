/**
 * Created by lin on 2016/7/25.
 */
//如果没有break语句，执行流就会进入下一个case语句。
public class NoBreak1 {
    public static void main(String args[]){
        int i;
        for(i=0; i<=5; i++){
            switch(i){
                case 1:
                case 2:
                case 3:System.out.println("i is 1,2 or 3");
                    break;//在该代码中，如果i的值为1、2或3，就会执行第一个println()语句。
                case 4:System.out.println("i is 4");
                    break;//如果i为4，就会执行第二个println()语句。
            }
        }
    }
}
