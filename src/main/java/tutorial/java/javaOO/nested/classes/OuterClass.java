package tutorial.java.javaOO.nested.classes;

/**
 * @author Yuanming Tao
 * Created on 2019/3/4
 * Description
 */
public class OuterClass {


    public String s1;

    private String s2;

    public static String s3;


    /**
     * 无论静态还是非静态都是可以 OuterClass.NestedClass
     * @param args
     */
    public static void main(String[] args) {

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();


        OuterClass outerClass = new OuterClass();
        OuterClass.NonStaticNestedClass nonStaticNestedClass2 = new OuterClass().new NonStaticNestedClass();


        OuterClass.NonStaticNestedClass nonStaticNestedClass = new OuterClass().new NonStaticNestedClass();

        System.out.println(nonStaticNestedClass);
    }

    private void gg() {
        //该方法是实例方法 相当是调用该方法OuterClass的实例来new NonStaticNestedClass
        //而在main等static方法中必须先new OuterClass
        OuterClass.NonStaticNestedClass nonStaticNestedClass = new OuterClass.NonStaticNestedClass();
        OuterClass.NonStaticNestedClass nonStaticNestedClass2 = new NonStaticNestedClass();
        System.out.println(nonStaticNestedClass.getOuterMembers());
    }


    static class StaticNestedClass {

        public String getOuterMembers() {
            String s = "";
//            s = s1;
//            s = s2;
            s = s3;
            return "";
        }
    }

    class NonStaticNestedClass {

//        public static String s;

        public String getOuterMembers() {
            String s = s1;
            s = s2;
            s = s3;
            return s;
        }
    }

}


