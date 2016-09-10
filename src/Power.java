/**
 * Created by lin on 2016/7/28.
 */
//与使用for循环一样，while也是在循环顶部检查条件表达式，这就意味着循环代码可能根本不会被执行。
public class Power {
    public static void main(String args[]){
        int e;
        int result;
        for(int i=0; i<10; i++) {
            result = 1;
            e = i;
//只有当e大于0时，才执行while循环。因此，当e为0时，即它在for循环的第一次迭代中的值，while循环会被跳过。
            while(e > 0){
                result *= 2;
                e--;//乘一次减一个数，直到e=0，结束循环输出结果。
            }
            System.out.println("2的 " + i + " 幂是 " + result);
        }
    }
}
