package tutorial.java.IandI.inheritance.super2;

/**
 * @author Yuanming Tao
 * Created on 2019/4/9
 * Description
 */
public class DemoNoArgumentConstructorSubB extends DemoNoArgumentConstructorSuperB {

    private Integer c;

    /**
     * 无法将类 com.fota.option.manager.DemoNoArgumentConstructorSuperB中的构造器 DemoNoArgumentConstructorSuperB应用到给定类型;
     * There is not default constructor available in 'DemoNoArgumentConstructorSuperB'
     * If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.
     * If the super class does not have a no-argument constructor, you will get a compile-time error.
     * 如果没有显示的调用父类的构造器，那么编译器会自动插入调用父类默认的无参构造器
     */
//    public DemoNoArgumentConstructorSubB(Integer c) {
//        this.c = c;
//    }

    public DemoNoArgumentConstructorSubB(Integer c) {
        super(c);
        this.c = c;
    }

}


////
//// Source code recreated from a .class file by IntelliJ IDEA
//// (powered by Fernflower decompiler)
////
//
//package com.fota.option.manager;
//
//public class DemoNoArgumentConstructorSubB extends DemoNoArgumentConstructorSuperB {
//    private Integer c;
//
//    public DemoNoArgumentConstructorSubB(Integer c) {
//        super(c);
//        this.c = c;
//    }
//}
