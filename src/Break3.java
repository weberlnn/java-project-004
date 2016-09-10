/**
 * Created by lin on 2016/7/28.
 */
//在嵌套循环中使用break语句时，它结束的只是内部循环。
public class Break3 {
    public static void main(String args[]){
        for(int i=0; i<3; i++) {
            System.out.println("外循环计数: " + i);
            System.out.println("   内循环计数：");
            int t = 0;
            while(t < 100) {
                if(t == 10) break;
                //内部循环的break语句只能使内部循环终止。外部循环不受其影响。
                System.out.println(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("循环完成。");
/*关于break语句还有两点需要记住。第一，一个循环中可以出现多个break语句。然而要小心，太多的
break语句会破坏代码结构。第二，结束switch语句的break语句只影响switch语句，而不影响其外层的循环。
*/
    }
}
