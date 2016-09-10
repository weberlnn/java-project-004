/**
 * Created by lin on 2016/7/28.
 */
/*使用break语句退出循环
使用break语句可以跳过循环体的其余代码和循环的条件测试，强迫循环立即退出。
当在某个循环内部遇到一个break语句时，循环终止，程序控制流转移至循环后面的语句。
 */
public class BreakDemo {
    public static void main(String args[]){
        int num;
        num = 100;
        for(int i=0; i < num; i++) {
            if(i*i >= num) break;
            System.out.print(i + "\t");
        }
        System.out.println("循环完成。");
    }
}
/*尽管这是一个用于运行从0到num（在本例中为100）的for循环，但是break语句会使
循环在i的平方大于或等于num时提前终止。
 */
