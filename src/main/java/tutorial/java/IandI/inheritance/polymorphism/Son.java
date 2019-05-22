package tutorial.java.IandI.inheritance.polymorphism;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
public class Son extends Father {



    @Override
    void print() {
        System.out.println("Son");
    }

    @Override
    public void test() {
        super.test();
    }

    @Override
    public void testprint() {
        System.out.println("Son");
    }
}
