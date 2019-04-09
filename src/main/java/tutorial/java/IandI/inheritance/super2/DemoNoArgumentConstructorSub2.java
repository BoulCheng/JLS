package tutorial.java.IandI.inheritance.super2;

/**
 * @author Yuanming Tao
 * Created on 2019/4/9
 * Description
 */
public class DemoNoArgumentConstructorSub2 extends DemoNoArgumentConstructorSuper {
    private Integer b;
//
//
//    public DemoNoArgumentConstructorSubB(Integer b) {
//        this.b = b;
//    }



    public DemoNoArgumentConstructorSub2(Integer b) {
        super();
        this.b = b;
    }
}

////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package com.fota.option.manager;
//
//public class DemoNoArgumentConstructorSub2 extends DemoNoArgumentConstructorSuper {
//    private Integer b;
//
//    public DemoNoArgumentConstructorSub2(Integer b) {
//        this.b = b;
//    }
//}

