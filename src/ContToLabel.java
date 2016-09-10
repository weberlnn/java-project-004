/**
 * Created by lin on 2016/7/31.
 */
//与使用break语句一样，continue语句可以指定一个标记来描述要继续执行的包含它的循环。
public class ContToLabel {
    public static void main(String args[]){
        outerloop:
        for(int i=1; i<10; i++) {
            System.out.print("\n外层循环" + i +", 内循环:");
            for(int j=1; j<10; j++) {
                if(j == 5) continue outerloop;
                System.out.print(j);
//在执行continue语句时，控制会跳过其他内部循环转移到外部循环。
            }
        }
    }
}
