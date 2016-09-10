/**
 * Created by lin on 2016/7/24.
 */
//条件表达式被从上到下一一检查。
public class Ladder {
    public static void main(String args[]) {
        //一旦找到为真的条件，就执行与其相关的语句，而后面的语句就会被跳过。
        //如果条件表达式都不为真，那么就执行最后一个else语句。
        int x;
        for(x=0; x<6; x++) {
            if(x == 1)
                System.out.println("x is one");
            else if(x == 2)
                System.out.println("x is two");
            else if(x == 3)
                System.out.println("x is three");
            else if(x == 4)
                System.out.println("x is four");
            else//一个else语句总是和同一个代码块中最接近且没有else与之匹配的if语句相匹配。
                System.out.println("x is not between 1 and 4");//这是一个默认语句。
            //最后一个else语句往往被作为一个默认条件，如果其他条件测试失败，就执行最后一个else语句。
            //如果没有最后一个else语句，而且其他条件都为假，那么就不会有动作发生。
        }
    }
}
