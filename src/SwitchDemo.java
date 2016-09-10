/**
 * Created by lin on 2016/7/25.
 */
//下面的程序演示了switch语句。
    //switch语句提供了一个多路分支；因此，它可以使程序在多个选项中进行选择。
public class SwitchDemo {
    public static void main(String args[]){
        int i;

        for(i=0;i<10;i++)
            switch(i) {//switch的表达式只是一个变量，而不是一个较大的表达式。
                case 0: //case语句中指定的每个值必须是一个唯一的常量表达式（例如一个字面值）。
                    //重复的case值是不允许的。每个值的类型必须与switch表达式的类型兼容。
                    System.out.println("i是0");
                    break;//当找到一个匹配时，就执行与该语句相关的语句，直到遇到break为止。
                case 1:
                    System.out.println("我是1");
                    break;
                case 2:
                    System.out.println("我是2");
                    break;
                case 3:
                    System.out.println("我是3");
                    break;
                case 4:
                    System.out.println("我是4");
                    break;
                default://如果没有与表达式的值相匹配的case常量，那么就执行default语句序列。
              //default语句是可选的，如果没有该语句，那么当所有的匹配都不成功时，就不会发生任何动作。
                    System.out.println("我是5或更多");
              //每次循环，执行的都是与i匹配的case常量的相关语句，所以其他语句都会被跳过。
              //当i大于等于5时，就没有与之匹配的case语句了，因此会执行default语句。
            }
    }
}
