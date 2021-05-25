## The Unary Operators


##### ++ --
- The unary operators require only one operand
- The increment/decrement operators can be applied before (prefix) or after (postfix) the operand
- The only difference is that the prefix version (++result) evaluates to the incremented value, whereas the postfix version (result++) evaluates to the original value.

- result++ 
    - (先执行)先进行表达式运算，再进行自增运算
    - 先把该变量的值从 局部变量表load加载到操作数栈顶， 然后执行加一操作把局部变量表中该变量的值加1再写回局部变量表中该变量
- ++result
    - 先进行自增运算，(后执行)再进行表达式运算
    - 先执行加一操作把局部变量表中该变量的值加1再写回局部变量表中该变量，再把该变量的(加一后)值从 局部变量表load加载到操作数栈顶， 
    