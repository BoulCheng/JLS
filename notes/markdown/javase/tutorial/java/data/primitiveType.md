
- 自动类型转换
    - 自动类型转换是指：数字表示范围小的数据类型可以自动转换成范围大的数据类型。
    - 自动转换也要小心数据溢出问题
        ```
       int count = 100000000;
       int price = 1999;
       long totalPrice = count * price; //负数 //两个 int 相乘得到的结果是 int, 但乘的结果超出了 int 的代表范围
        ```
    - 向下转换时可以直接将 int 常量字面量赋值给 byte、short、char 等数据类型，而不需要强制转换，只要该常量值不超过该类型的表示范围都能自动转换
- 强制类型转换
    - 强制显示的把一个数据类型转换为另外一种数据类型
        - 丢失精度
                    ```
                            float f = 10.1f;
                            int f2 = (int) f; // 10

                    ```   
        - 数据溢出 
            ```
                  int ii = 300;
                  byte b = (byte)ii; //44


            ```     
            - 会转换成一个毫无意义的数字
            
- 类型提升
    - 在多种不同数据类型的表达式中，类型会自动向范围表示大的值的数据类型提升
        ```
        long count = 100000000;
        int price = 1999;
        long totalPrice = price * count; //price 为 int 型，count 为 long 型，运算结果为 long 型，运算结果正常，没有出现溢出的情况。
        ```
    

- java
```

    /**
     * 在多种不同数据类型的表达式中，类型会自动向范围表示大的值的数据类型提升
     *
     * () 运算符优先级比 * 更高
     * @param args
     * 
     * 输出
     * 1938288676
     * 1938288676
     * 1152826961430048804
     * 1152826961430048804
     */
    public static void main(String[] args) {

        long l = 1073697798 * 1073697798;
        System.out.println(l);
        l = (long)(1073697798 * 1073697798); // 这只是把高位截取后的已经不正确的int值赋给了long
        System.out.println(l);
        l = (long)1073697798 * 1073697798;
        System.out.println(l);
        l = (long)((long)1073697798 * 1073697798);
        System.out.println(l);
    }

```    