# this key

- Within an instance method or a constructor, this is a reference to the current object — the object whose method or constructor is being called. 
- You can refer to any member of the current object from within an instance method or a constructor by using this.


- Using this with a Field

    - The most common reason for using the this keyword is because a field is shadowed by a method or constructor parameter.
  
- Using this with a Constructor

    - From within a constructor, you can also use the this keyword to call another constructor in the same class. (Doing so is called an explicit constructor invocation. )
    
    - If present, the invocation of another constructor must be the first line in the constructor.
      
