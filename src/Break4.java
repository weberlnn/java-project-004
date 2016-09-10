/**
 * Created by lin on 2016/7/31.
 */
/*当这种break语句执行时，控制权就会转移到代码块以外。已标记的代码块必须包含break语句，但
是它不必立刻结束代码块。这就意味着你可以使用一个带标记的break语句从一系列嵌套代码块中退出。
然而不能使用break语句把控制权转移到另一个不包含break语句的代码块。
要命名一个代码块，只需要在它前面加一个标记就可以。被标记的代码块可以是一个单独的代码块，
或一个以代码块作为目标的语句。一旦对一个代码块进行了标记，就可以把这个标记作为一个break
语句的目标。这样做会使执行流在已标记代码块的结尾继续进行。
 */
public class Break4 {
    public static void main(String args[]){
        int i;
        for(i=1; i<4; i++){
            one:{
                two:{
                    three:{
                        System.out.println("\n i is " + i);
                        if(i==1) break one;//跳转到标记位置。
                        if(i==2) break two;
                        if(i==3) break three;
                         System.out.println("won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two." );
            }
            System.out.println("After block one.");
        }
        System.out.println("After for.");
    }
}
/*当i为1时，第一个if语句成立，这使得控制权转移到标记one定义的代码块的结尾，输出After block one。
当i为2时，第二个if条件成立，使得控制权转移到标记two定义的代码块的结尾，输出消息After block two.
和After block noe.。当i为3时，第三个if条件成立，控制将转换到标记three定义的代码块的结尾。这时
就会显示所有三条消息。
 */