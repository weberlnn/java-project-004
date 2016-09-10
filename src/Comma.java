/**
 * Created by lin on 2016/7/26.
 */
//for循环的一些变体。
//可以使用多重循环控制变量。
public class Comma {
    public static void main(String args[]){
        int i, j;
        //逗号分隔了两个初始化语句和两个循环表达式
        for(i=0,j=10;i<j;i++,j--)//有两个循环控制变量。
            //每次循环时，i会增加，j会减少，i不能大于j。
            System.out.println("i and j: " + i +" " + j);
    }
}
