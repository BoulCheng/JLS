package tutorial.essential.exceptions;

/**
 * @author Yuanming Tao
 * Created on 2019/3/6
 * Description
 */
public class TestFinally {

    public static void main(String[] args) {
        test();
    }


    private static boolean test() {
        try {
            int i = 0;
            //即使return也会执行finally
            return true;
        } finally {
            System.out.println("finally");
        }
    }
}
