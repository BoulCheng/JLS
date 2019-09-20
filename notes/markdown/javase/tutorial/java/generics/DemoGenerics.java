package com.zlb.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yuanming Tao
 * Created on 2019/3/2
 * Description
 */
public class DemoGenerics {

    public static void main(String[] args) {

//
//        List<? extends SuperOfA> listSuperOfA = new ArrayList<>();
//        listSuperOfA.add(new SubOfA());
//        listSuperOfA.add(new A());
//        listSuperOfA.add(new SuperOfA());



        List<? super SubOfA> listSubOfA = new ArrayList<>();
        listSubOfA.add(new SubOfA());
//        listSubOfA.add(new A());
//        listSubOfA.add(new SuperOfA());

        List<? super A> listA = new ArrayList<>();
        listA.add(new SubOfA());
        listA.add(new A());
//        listA.add(new SuperOfA());

        List<? super SuperOfA> listSuperOfA = new ArrayList<>();
        listSuperOfA.add(new SubOfA());
        listSuperOfA.add(new A());
        listSuperOfA.add(new SuperOfA());

        List<A> aList = Arrays.asList(new A(), new A(), new A());
//        listSuperOfA = aList;

        List<? super Number> list2 = new ArrayList<>();

        list2.add(new Integer(1));
        list2.add(new Number() {
            @Override
            public int intValue() {
                return 0;
            }

            @Override
            public long longValue() {
                return 0;
            }

            @Override
            public float floatValue() {
                return 0;
            }

            @Override
            public double doubleValue() {
                return 0;
            }
        });


    }



}
