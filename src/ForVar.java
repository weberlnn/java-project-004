/**
 * Created by lin on 2016/7/26.
 */
/*在许多情况下，for循环控制变量只用于循环本身，并没有其它用途。这种情况下，我们就可以在for循环
的初始化部分声明循环控制变量。下面是一个计算从1到5的和与阶乘的程序，它就在for循环内部声明了循
环控制变量i。
 */
public class ForVar {
    public static void main(String args[]){
        int sum = 0;
        int fact = 1;//计算数字的阶乘到5。
        for(int i = 1; i <= 5; i++) {
            sum += i;//我是整个循环。
            fact *= i;
        }
        System.out.println("Sum is " + sum);
        System.out.println("阶乘是 " + fact);
    }
}
/*当你在for循环内部声明一个变量时；有一个重要的地方需要记住：该变量的作用域是在for语句的作用域
结束时结束的（即，变量的作用域局限在for循环内部）。在for循环外部，变量将不再起作用。因此，在前
面的程序中，在for循环外部是无法访问i的。如果需要在程序的其他地方使用循环控制变量，那么就不能在
for循环内部声明它。
 */