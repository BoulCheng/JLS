package tutorial.java.IandI.inheritance.polymorphism;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
abstract class GrandFather implements GrandFatherInterface {

    void print() {
        System.out.println("GrandFather");
    }


    void print2() {
        System.out.println("GrandFather2");
    }


    void print3() {
        System.out.println("GrandFather3");
    }

    void print4() {
        print3();
    }

    @Override
    public void test() {
        /**
         * 调用 {@link Son#testprint()}
         *
         * 如果注释掉{@link Son#testprint()} 则会调用{@link Father#testprint()}
         */
        this.testprint();
    }

    public void testprint() {
        System.out.println("GrandFather");
    }
}
