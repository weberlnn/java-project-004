/**
 * Created by lin on 2016/7/31.
 */
public class Break6 {
    public static void main(String args[]){
        int x=0, y=0;
        //标记位于外部for循环之前。
        //这种情况下，执行break语句时，控制权会跳过外部循环转移到整个for代码块的末尾。
        stop1:for(x = 0; x < 5; x++) {
            for(y = 0; y < 5; y++) {
                if(y == 2) break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();
        //标记位于外部for语句的左花括号之前。因此，在执行break stop2语句时，控制权
        //会转移到外部for代码的末尾，使得下一次循环开始。
        for(x = 0; x < 5; x++)
            stop2: {
                for(y = 0; y < 5; y++){
                    if(y == 2) break stop2;
                    System.out.println("x and y: "+ x + " " + y);
                }
            }
    }
}
/*在该程序中，两组嵌套循环只有一处不一样。在第一组中，标记位于外部for循环之前。这种情况下，
执行break语句时，控制权会跳过外部循环转移到整个for代码块的末尾。在第二组中，标记位于外部for
语句的左花括号之前。因此，在执行break stop2语句时，控制权会转移到外部for代码块的末尾，使得
下一次循环开始。
 */