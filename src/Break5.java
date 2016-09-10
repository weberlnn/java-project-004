/**
 * Created by lin on 2016/7/31.
 */
/*这次，break用于跳出一系列嵌套for循环。当内部循环的break语句被执行时，程序
控制权会跳转到外部for循环定义的代码块标有done的末尾。这就会跳过其余的三个循环。
 */
public class Break5 {
    public static void main(String args[]) {
        done:
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                for(int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if(k == 5) break done;//跳转到完成。
                }
                System.out.println("After k loop");//不执行。
            }
            System.out.println("After j loop");//不执行。
        }
        System.out.println("After i loop");
    }
}