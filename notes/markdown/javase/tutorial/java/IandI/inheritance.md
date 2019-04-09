# inheritance




## Polymorphism
 
-  The dictionary definition of polymorphism refers to a principle in biology in which an organism or species can have many different forms or stages. This principle can also be applied to object-oriented programming and languages like the Java language. Subclasses of a class can define their own unique behaviors and yet share some of the same functionality of the parent class.
   
- The Java virtual machine (JVM) calls the appropriate method for the object that is referred to in each variable. It does not call the method that is defined by the variable's type. (i.e., Java虚拟机(JVM)为每个变量中引用的对象调用适当的方法。它不调用由变量类型定义的方法)

- This behavior is referred to as virtual method invocation and demonstrates an aspect of the important polymorphism features in the Java language.



## super Keyword
- Accessing Superclass Members
    - If your method overrides one of its superclass's methods, you can invoke the overridden method through the use of the keyword super
    
- Subclass Constructors
    - use the super keyword to invoke a superclass's constructor.
    - Invocation of a superclass constructor must be the first line in the subclass constructor.
    - With super(), the superclass no-argument constructor is called. With super(parameter list), the superclass constructor with a matching parameter list is called.
    
    - If a constructor does not explicitly invoke a superclass constructor, the Java compiler automatically inserts a call to the no-argument constructor of the superclass.   
    - If the super class does not have a no-argument constructor, you will get a compile-time error. Object does have such a constructor, so if Object is the only superclass, there is no problem.
    - If a subclass constructor invokes a constructor of its superclass, either explicitly or implicitly, you might think that there will be a whole chain of constructors called, all the way back to the constructor of Object. In fact, this is the case. It is called constructor chaining, and you need to be aware of it when there is a long line of class descent.
    
    