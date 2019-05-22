package tutorial.java.IandI.inheritance.polymorphism;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
abstract class Father extends GrandFather {

    @Override
    void print() {
        System.out.println("Father");
    }

    @Override
    void print2() {
        System.out.println("Father2");
    }

    @Override
    void print3() {
        System.out.println("Father3");
    }

    @Override
    public void test() {
        super.test();
    }

    @Override
    public void testprint() {
        System.out.println("Father");
    }
}
