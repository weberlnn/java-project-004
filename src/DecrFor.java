/**
 * Created by lin on 2016/7/26.
 */
//for循环可以以正值或负值的形式执行，它可以用任何变化量来修改循环控制的变量。
public class DecrFor {
    public static void main(String args[]){
        int x;
        for(x = 100; x >=-100; x -= 5)//循环控制变量每次递减5。
            System.out.println(x);
    }
}
/*for循环的一个关键是条件表达式是在循环的顶部进行测试的。这就意味着如果一开始
条件就不成立，那么循环中的代码就根本不会被执行。例如：
for(count=10; count<5; cunt++)
  x += count;  该循环不会被执行，因为在第一次进入循环时，它的控制变量count就大于5。
 */
