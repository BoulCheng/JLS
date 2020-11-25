#### 泛型
- 泛型实现了参数化类型，使得你编写的组件（通常是集合）可以适用于多种类型，将类型参数化；
- 解耦类或方法与所使用的类型之间的约束，使得类或方法具备最宽泛的表达力
- define
      -  generics enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods
      -  type parameters provide a way for you to re-use the same code with different inputs. The difference is that the inputs to formal parameters are values, while the inputs to type parameters are types.
      - A generic type is a generic class or interface that is parameterized over types.

- 类型参数
- 类型参数推断
- 泛型擦除
    - 擦除成原生类型
    - 为泛型类给定一个边界，以此告诉编译器只能接受遵循这个边界的类型，泛型类型参数会擦除到它的第一个边界
    - 擦除减少了泛型的泛化性，泛型类型只有在静态类型检测期间才出现，在此之后，程序中的所有泛型类型都将被擦除，替换为它们的非泛型上界。
        - 例如， List<T> 这样的类型注解会被擦除为 List，普通的类型变量在未指定边界的情况下会被擦除为 Object， （static class Quark<Q extends Building> {} 仍然被擦除为Q？）
    - 有关泛型擦除的困惑，其实是 Java 为实现泛型的一种妥协，因为泛型并不是 Java 语言出现时就有的
        - 在 Java5 以前编写的类库是没有使用泛型的，而作者可能打算重新用泛型编写，或者根本不打算这样做。Java 设计者们既要保证旧代码和类文件依然合法，还得考虑当某个类库变为泛型时，不会破坏依赖于它的代码和应用。
            - Java 设计者们最终认为泛型是唯一可行的解决方案，擦除使得向泛型的迁移成为可能，为了实现非泛型的代码和泛型代码共存，必须将某个类库使用了泛型这样的“证据”擦除
        - 基于上述观点，当你在编写泛型代码时，必须时刻提醒自己，你只是看起来拥有有关参数的类型信息而言。因为擦除，我们无法在运行时知道确切的类型，为了补偿擦除带来的弊端，我们可以为所需的类型显示传递一个 Class 对象，以在类型表达式中使用它
            ```
            public class ClassTypeCapture<T> {
            
            
                Class<T> kind;
            
                public ClassTypeCapture(Class<T> kind) {
                    this.kind = kind;
                }
            
                public boolean f(Object arg) {
                    return kind.isInstance(arg);
                }
            
            
            
                public static void main(String[] args) {
            
                    Quark<House> quark = new Quark<>();
                    System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));// [Q]
            
            
                    ClassTypeCapture<Building> ctt1 =
                            new ClassTypeCapture<>(Building.class);
                    System.out.println(ctt1.f(new Building()));
                    System.out.println(ctt1.f(new House()));
                    ClassTypeCapture<House> ctt2 =
                            new ClassTypeCapture<>(House.class);
                    System.out.println(ctt2.f(new Building()));
                    System.out.println(ctt2.f(new House()));
                }
            
            
                static class Quark<Q extends Building> {}
            
                static class Building {
                }
            
                static class House extends Building {
                }
            
            }

            
            ```
- 泛型只有在类型参数比某个具体类型（以及其子类）更加“泛化”，代码能跨多个类工作时才有用

- 泛型方法
    - Generic methods are methods that introduce their own type parameters. This is similar to declaring a generic type, but the type parameter's scope is limited to the method where it is declared. Static and non-static generic methods are allowed, as well as generic class constructors.
    - The syntax for a generic method includes a list of type parameters, inside angle brackets, which appears before the method's return type. For static generic methods, the type parameter section must appear before the method's return type.

``` 
public class TTTT {
    /**
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T test(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> Integer test2(Class<T> c) {
        return 1;
    }

    public <P> P test3(Class<P> c) {
        P t = null;
        try {
            t = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

    public <K> Integer test4(Class<K> c) {
        return 1;
    }
}
```
- 泛型类
    - The type parameter section, delimited by angle brackets (<>), follows the class name. It specifies the type parameters (also called type variables) T1, T2, ..., and Tn.
    - By convention, type parameter names are single, uppercase letters
    - T, that can be used anywhere inside the class.
    - You can think of a generic type invocation as being similar to an ordinary method invocation, but instead of passing an argument to a method, you are passing a type argument — Integer in this case — to the Box class itself.
    - the T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument.
```
public class TTTT<T> {

    /**
     * For static generic methods, the type parameter section must appear before the method's return type.
     * @param c
     * @param <T>
     * @return
     */
    public static <T> T test(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

    public static <T> Integer test2(Class<T> c) {
        return 1;
    }

    public T test3(Class<T> c) {
        T t = null;
        try {
            t = c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return t;
    }

    public Integer test4(Class<T> c) {
        return 1;
    }

}
```

- 边界和通配符
    - 由于擦除会删除类型信息，因此唯一可用于无限制泛型参数的方法是那些 Object 可用的方法。边界允许我们对泛型使用的参数类型施以类型，将参数限制为某类型的子集，那么就可以调用该子集中的方法。为了应用约束，Java 泛型使用了 extends 关键字
    - 引入通配符可以在泛型实例化时更加灵活地控制，也可以在方法中控制方法的参数？？ 
- Wildcards
    - unbounded
        - The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>. This is called a list of unknown type. There are two scenarios where an unbounded wildcard is a useful approach:
            - If you are writing a method that can be implemented using functionality provided in the Object class.
            - When the code is using methods in the generic class that don't depend on the type parameter. For example, List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.
    - upper-bounded
        - (<T extends List>) 是限定泛型T的上界为List
        - To declare an upper-bounded wildcard, use the wildcard character ('?'), followed by the extends keyword, followed by its upper bound. Note that, in this context, extends is used in a general sense to mean either "extends" (as in classes) or "implements" (as in interfaces).
    - lower bounded
        - A lower bounded wildcard is expressed using the wildcard character ('?'), following by the super keyword, followed by its lower bound: <? super A>.

    - Wildcards and Subtyping
        - The common parent of List<Number> and List<Integer> is List<?>.
        - List<? extends Integer> is a subtype of List<? extends Number>
        - the relationships between several List classes declared with both upper and lower bounded wildcards.
    - Guidelines for Wildcard Use
        - For purposes of this discussion, it is helpful to think of variables as providing one of two functions:
            - An "in" variable serves up data to the code. Imagine a copy method with two arguments: copy(src, dest). The src argument provides the data to be copied, so it is the "in" parameter.
                - An "in" variable is defined with an upper bounded wildcard, using the extends keyword.
                - In the case where the "in" variable can be accessed using methods defined in the Object class, use an unbounded wildcard.
                - A list defined by List<? extends ...> can be informally thought of as read-only, but that is not a strict guarantee.
            - An "out" variable holds data for use elsewhere. In the copy example, copy(src, dest), the dest argument accepts data, so it is the "out" parameter.
                - An "out" variable is defined with a lower bounded wildcard, using the super keyword.
            - Of course, some variables are used both for "in" and "out" purposes — this scenario is also addressed in the guidelines.
                - In the case where the code needs to access the variable as both an "in" and an "out" variable, do not use a wildcard.
    
        ```
            private static List<? super Number> print(List<? extends Number> list) {
                List<? super Number> list2 = new ArrayList<>();
                for (Number number : list) {
                    System.out.println(number.toString());
                    list2.add(number);
                }
                return list2;
            }
        ```
        ```
        上界使用 extends 
        无界使用 ?    使用情况： 1可以使用Object函数实现的方法； 2不依赖于类型参数的泛型类的方法，Class<?>经常使用在Class<T>类中的方法
        下界使用 super
        不能同时定义上界和下界  
        List<Integer> 和 List<? super Number> 没有继承关系
        
        
        把变量想象成提供以下两个函数之一
        An "in" variable 提供数据  定义为上界 如果in变量可以使用Object方法则定义为无界 可认为只读但不是严格意义上的
        An "out" variable 保存数据以供在任何其他地方使用  定义为下界
        如果变量同时定义为 in 和 out 那么不用使用通配符
        ```