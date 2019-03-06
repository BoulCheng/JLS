package tutorial.java.javaOO.nested.classes;

/**
 * @author Yuanming Tao
 * Created on 2019/3/5
 * Description
 */
public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            //The variable x defined as a parameter of the method methodInFirstLevel shadows the variable of the inner class FirstLevel
            //Consequently, when you use the variable x in the method methodInFirstLevel, it refers to the method parameter.
            System.out.println("x = " + x);

            //To refer to the member variable of the inner class FirstLevel, use the keyword this to represent the enclosing scope
            System.out.println("this.x = " + this.x);

            //Refer to member variables that enclose larger scopes by the class name to which they belong.
            //For example, the following statement accesses the member variable of the class ShadowTest from the method methodInFirstLevel:
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
    /**
     * The following is the output of this example:
     * x = 23
     * this.x = 1
     * ShadowTest.this.x = 0
     */
}