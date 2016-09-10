/**
 * Created by lin on 2016/7/25.
 */
//证明switch没有打破语句。
public class NoBreak {
    public static void main(String args[]){
        int i;
        for(i=0; i<=5; i++) {
            switch(i) {
                case 0://如果没有break语句，执行就会进入下一个case语句。
                    System.out.println("我是不到1");
                case 1:
                    System.out.println("我是不到2");
                case 2:
                    System.out.println("我是不到3");
                case 3:
                    System.out.println("我是不到4");
                case 4:
                    System.out.println("我是不到5");
/*当在case语句序列中遇到break语句时，它会使程序流程整个switch中退出，从switch以外的以一个语句继续执行。
如果该break语句没有结束与case相关的语句序列，那么就会执行从匹配case语句开始往后的所有语句，
直到又遇到一个break语句（或到达switch末尾）为止。
*/
            }
            System.out.println();
        }
    }
}
