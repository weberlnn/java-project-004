/**
 * Created by lin on 2016/7/25.
 */
//将建立一个用来显示java控制语句语法的简单的帮助系统。
//程序将显示一个包含控制语句的菜单，然后等待你选择。在选择后，就显示该语句的语法。
public class Help {
    public static void main(String args[])
        throws java.io.IOException {
        char choice;

        System.out.println("帮助:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("选择一个: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice) {
            case '1':
                System.out.println("那 if:\n");
                System.out.println("if（条件）语句;");
                System.out.println("else 语句;");
                break;
            case '2':
                System.out.println("那 switch:\n");
                System.out.println("switch(表达式) {");
                System.out.println(" case 条件:");
                System.out.println("  语句序列");
                System.out.println("  break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("选择未找到");
        }
    }
}
