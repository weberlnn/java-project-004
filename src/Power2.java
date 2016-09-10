/**
 * Created by lin on 2016/7/30.
 */
public class Power2 {
    public static void main(String args[]){
        int x;
        int z;
        for(int i=0; i<=5; i++) {
            z = 1;
            x = i;
            while(x>0){
                z *= 2;
                x--;
            }
            System.out.println("2的" + i + "幂是" + z);
        }
    }
}
