/**
 * Created by lin on 2016/7/26.
 */
//初始化部分被移出了for循环。
public class Empty2 {
    public static void main(String args[]) {
        int i;
        i = 0;//初始化循环控制变量。
        //将初始化表达式移到了循环体之外。
        for(;i<10;){//i<10前后必须要用分号。
            System.out.println("Pass #" +i);
            i++;//增加循环控制变量。
        }
    }
}
/*在此版本中，在循环开始前就把i初始化了，没有把它作为for循环的一部分。一般情况下都是把循环控制
变量的初始化放在for循环内部，但是当初值是通过某一复杂过程得到，而又不方便把这一过程放在for语句
时，可以把初始化放在循环之外。
 */