package tutorial.java.javaOO.nested.interfaces;

/**
 * @author Yuanming Tao
 * Created on 2019/3/5
 * Description
 */
class NestedInterfaceDemo2 implements MyClass.MyInterfaceB {

    @Override
    public void myMethod() {
        System.out.println("Nested interface method");
    }

    public static void main(String args[]) {
        MyClass.MyInterfaceB obj = new NestedInterfaceDemo2();
        obj.myMethod();
    }
}
