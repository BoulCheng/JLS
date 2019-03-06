package tutorial.java.IandI.inheritance.polymorphism;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
abstract class GrandFather {

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


}
