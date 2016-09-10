/**
 * Created by lin on 2016/7/29.
 */
public class DecrFor2 {
    public static void main(String args[]){
        for(int i=0; i<10; i++ ){
            System.out.println(i);
            if((i%2) ==0)continue;//结束本次循环,下一次迭代发生。
            System.out.println();
        }
    }
}
