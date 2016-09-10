/**
 * Created by lin on 2016/7/26.
 */
//缺失部分要素的for循环。
public class Empty {
    public static void main(String args[]){
        int i;    //省略了迭代表达式。
        for(i=0;i<10;){ //在java中，for循环的所有或部分初始化、条件或迭代部分都可以为空。
            System.out.println("Pass #" +i);
            //因为i的增加在循环体内部，所以循环还可以正常进行。
            i++;//增加循环控制变量。
            /*这里，for循环没有迭代表达式，而把循环控制变量i的增加放在了循环体的内部。
            这就意味着每次循环时都要测试i是否等于10，除此之外就没有进一步的动作了。
            当然，因为i的增加在循环体内部，所以循环还可以正常进行。
            */
        }
    }
}
