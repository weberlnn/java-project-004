/**
 * Created by lin on 2016/7/26.
 */
//没有循环体的循环。
    //java中，for循环（或其它循环）可以没有循环体，因为空语句(null statement)在语法上是有效的。
public class Empty3 {//这是一个计算从1到5的数之和的程序。
    public static void main(String args[]){
        int i;
        int sum = 0;
        for(i = 1; i <= 5; sum += i++)
        //整个求和过程是在for语句中完成的，不需要循环体。
        System.out.println("Sun is " + sum);
    }
}

/*这里要特别注意迭代表达式： sum += i++     不要被这样的语句所迷惑，他们在专业java程序中是很
普遍的，如果把它们分成各部分来看的话，就可以很轻松地理解它们了。换句话说，这条语句的意思就是：“
把sum的值加i后再加到sum上，然后将i加1”。因此，这条语句与下面的语句是等价的：
sum = sum + i；

 */