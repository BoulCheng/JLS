package tutorial.java.javaOO.nested.interfaces;

/**
 * @author Yuanming Tao
 * Created on 2019/3/5
 * Description
 */
interface MyInterfaceA {
    void display();

    interface MyInterfaceB {
        void myMethod();
    }
}

