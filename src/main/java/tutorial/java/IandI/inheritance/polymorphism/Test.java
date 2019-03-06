package tutorial.java.IandI.inheritance.polymorphism;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
public class Test {

    public static void main(String[] args) {


        Son son = new Son();
        son.print();

        son.print2();

        /**
         * GrandFather#print4 -> Son#print3 -> Father#print3 -> GrandFather#print3
         */
        son.print4();
    }
}
