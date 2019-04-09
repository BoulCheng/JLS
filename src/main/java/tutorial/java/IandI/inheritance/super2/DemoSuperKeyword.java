package tutorial.java.IandI.inheritance.super2;

/**
 * @author Yuanming Tao
 * Created on 2019/4/9
 * Description
 */
public class DemoSuperKeyword {


    public static void main(String[] args) {

        Subclass subclass = new Subclass();
        subclass.go();
        System.out.println(subclass.toString());

    }

    static class Superclass {

        private Integer a;
        protected Integer b;
        public Integer c;

        public Integer getA() {
            return a;
        }

        public void setA(Integer a) {
            this.a = a;
        }

        public Integer getB() {
            return b;
        }

        public void setB(Integer b) {
            this.b = b;
        }

        public Integer getC() {
            return c;
        }

        public void setC(Integer c) {
            this.c = c;
        }

        public void go() {
            System.out.println("Superclass");

        }

        @Override
        public String toString() {
            return "Superclass{" +
                    "a=" + a +
                    ", b=" + b +
                    ", c=" + c +
                    '}';
        }
    }


    static class Subclass extends Superclass {

        @Override
        public void go() {
            super.go();
            System.out.println("Subclass");
            super.a = 1;
        }
    }


    static class SubA extends SuperA {

    }

    static class SuperA {

    }


}

