

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
    
    