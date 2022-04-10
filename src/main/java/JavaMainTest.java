//: src/main/java/JavaMainTest.java

/** 这个类是用于java逻辑的测试以及基本语法的测试
 * 通过在main函数中调用内部类定义的函数达到训练的目的
 * */
public class JavaMainTest {
    /** 这个函数是代码的主函数
     * @param args 命令行输入, 但是这里并不使用这个输入
     */
    public static void main(String[] args){
        LabelTesting.testing();
    }

    /** 用于测试Java中label的用法的类
     * */
    private static class LabelTesting{

        public static void testing(){
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
//                continue finishLabel; 这里不能这么使用, 会导致未定义错误
            }
            finishLabel:
            System.out.println("end");
        }
    }
}
