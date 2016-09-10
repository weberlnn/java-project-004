/**
 * Created by lin on 2016/7/28.
 */
//java的另一种循环是while循环。
public class WhileDemo {
    public static void main(String args[]) {
        char ch;
        ch = 'a';//这里，初始化ch为字母a。
        //每次迭代循环时，都输出ch，然后将它加1。这个过程会一直持续，直到ch大于等于z。
        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
