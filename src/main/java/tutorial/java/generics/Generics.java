package tutorial.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuanming Tao
 * Created on 2019/5/16
 * Description
 */
public class Generics {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        List<Number> list0 = new ArrayList<>();
//        list0 = list; // compile error

        List<?> list1 = new ArrayList<>();

        List<? extends Integer> list2 = new ArrayList<>();
        List<? extends Number> list3 = new ArrayList<>();

        List<? super Integer> list4 = new ArrayList<>();
        List<? super Number> list5 = new ArrayList<>();


//        list2.add(new Integer(1));

    }

}
