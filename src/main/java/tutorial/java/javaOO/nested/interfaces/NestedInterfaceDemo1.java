package tutorial.java.javaOO.nested.interfaces;

/**
 * @author Yuanming Tao
 * Created on 2019/3/5
 * Description
 */
class NestedInterfaceDemo1 implements MyInterfaceA.MyInterfaceB {
    @Override
    public void myMethod() {
        System.out.println("Nested interface method");
    }

    public static void main(String args[]) {
        MyInterfaceA.MyInterfaceB obj = new NestedInterfaceDemo1();
        obj.myMethod();
    }
}

