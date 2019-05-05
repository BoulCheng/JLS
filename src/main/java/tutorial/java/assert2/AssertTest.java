package tutorial.java.assert2;

/**
 * @author Yuanming Tao
 * Created on 2019/3/15
 * Description
 */
public class AssertTest {


    /**
     * java assert(断言) 一般断言在开发和测试的阶段进行开启，用于检查程序的基本正确性，在VM arguments里面输入-ea就可以开启了。如果没有这个参数，assert在程序中将不起作用
     *
     *
     * assert基本语法：expression1表示一个boolean 表达式，expression2表示一个基本类型，表达式，或者一个对象，用于在失败的时候的输出信息。当expression1为false的时候，程序将会停止并抛出java.lang.AssertionError对象，如果含有expression2则附带expression2内容。
     *
     * 1. assert expression1;
     *
     * 2. assert expression1: expression2;
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {


        int i = 1;
        assert i == 1;

        System.out.println(1);

//        assert 1 == 0;

        System.out.println(0);

//        assert 1 == 0: 1;

//        assert 1 == 0 : new A();

        assert 1 == 0 : fun();



    }

    private static String fun() {
        return "99999";
    }

    static class A {
        @Override
        public String toString() {
            return "1111";
        }
    }



}
