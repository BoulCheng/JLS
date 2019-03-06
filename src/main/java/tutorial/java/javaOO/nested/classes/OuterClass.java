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


