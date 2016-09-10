/**
 * Created by lin on 2016/7/26.
 */
//下面的程序使用一个for循环来打印1~99的平方根以及每个平方根的差。
public class SqrRoot {
    public static void main(String args[]) {
        double num,sroot , rerr;//定义3个double的变量。

        for(num = 1.0; num < 100.0; num++){
            //Math.sqrt平方根，把值付给sroot。
             sroot = Math.sqrt(num);
            //输出计算结果到控制台。
            System.out.println("平方根 " + num + " 是 " + sroot);
            System.out.println(sroot*sroot);
            rerr = num - (sroot * sroot);//rerr的值是由num的原值减去sroot的平方。
            //误差是通过对每个平方根求平方后，再求与其原值的差而得到的。
            System.out.println("舍入误差是 " + rerr);
            System.out.println();
        }
    }
}
