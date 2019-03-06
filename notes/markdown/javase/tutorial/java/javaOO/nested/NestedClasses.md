# Nested Classes

- define a class within another class
- **Terminology: Nested classes are divided into two categories: static and non-static. Nested classes that are declared static are called static nested classes. Non-static nested classes are called inner classes.**
- A nested class is a member of its enclosing class.
- **Non-static nested classes (inner classes) have access to other members of the enclosing class, even if they are declared private**
- **Static nested classes do not have access to other members of the enclosing class.**
- **静态嵌套类可以访问外部类的静态成员，非静态可以访问外部类的私有、公有成员及静态、非静态成员**
- a nested class can be declared private, public, protected, or package private. (Recall that outer classes can only be declared public or package private.)

- As with class methods and variables, a static nested class cannot refer directly to instance variables or methods defined in its enclosing class: it can use them only through an object reference.
    ```
    OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
    ```
- As with instance methods and variables, an inner class has direct access to that object's methods and fields. Also, because an inner class is associated with an instance, it cannot define any static members itself.
    - An instance of InnerClass can exist only within an instance of OuterClass,To instantiate an inner class, you must first instantiate the outer class. Then, create the inner object within the outer object.
        ```
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        
        ```
        
- Compelling reasons for using nested classes include the following:
    - It is a way of logically grouping classes that are only used in one place
    - It increases encapsulation
    - It can lead to more readable and maintainable code
    

- Shadowing. *to see ShadowTest.java*

- There are two additional types of inner classes. *to see HelloWorldAnonymousClasses.java*
    - local classes: declare an inner class within the body of a method. Local classes are classes that are defined in a block, which is a group of zero or more statements between balanced braces. You typically find local classes defined in the body of a method.
    
    - anonymous classes: declare an inner class within the body of a method without naming the class.  Anonymous classes enable you to make your code more concise. They enable you to declare and instantiate a class at the same time. They are like local classes except that they do not have a name. Use them if you need to use a local class only once.
    
- situations of user
    - Nested class: Use a non-static nested class (or inner class) if you require access to an enclosing instance's non-public fields and methods. Use a static nested class if you don't require this access.
    
    - Local class: Use it if you need to create more than one instance of a class, access its constructor, or introduce a new, named type (because, for example, you need to invoke additional methods later).
    
    - Anonymous class: Use it if you need to declare fields or additional methods.
    
- Nested (or Inner) interfaces
    - An interface which is declared inside another interface or class
    - Nested interfaces are static by default. You don’t have to mark them static explicitly as it would be redundant.
    - Nested interfaces declared inside class can take any access modifier, however nested interface declared inside interface is public implicitly.
    
- 抽象类嵌套非静态内部类(e.g., AbstractList)