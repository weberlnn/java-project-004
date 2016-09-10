/**
 * Created by lin on 2016/7/31.
 */
/*跳过循环的正常控制结构来强制循环迭代也是可以的。使用continue就可以完成这项功能。
continue语句会跳过它本身与控制循环的条件表达式之间的任何代码，强迫循环的下一次迭代发生。
 */
public class ContDemo {//使用continue。
    public static void main(String args[]){
        int i;
        //打印偶数0到100之间。
        for(i = 0; i <= 100; i++) {
            if((i%2) != 0) continue;//迭代。
            System.out.println(i);
        }
    }
}
