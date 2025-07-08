# 面向对象  
## 标准javaBean类
- 成员变量私有
- 每一个成员变量有对应的get和set函数
- 有空的构造方法和完整的构造方法
- vscode中的源代码操作
## java内存图
- 数组和类都是引用数据类型
  - 数组名和类名只是一个引用，记录的是地址值
- this 方法调用者的地址值
## String类
= 两种常见构造方式的区别
  - 在堆区有一个串池
  - 不适用new如果`String a="abc"; String b="abc"`那么a和b指向相同的堆地址
  - 使用new是在堆中创建一个新的小空间
  - 直接赋值代码简单，节约内存
- 字符串的比较
  - 基本数据类型==号比的是数据值
  - 引用数据类型比较的是地址值
    - 不同构造方式产生的String，即使字符串相同，但是地址不同，不能用==比较
  - 正确比较
    - equals
    - equalsIgnoreCase
## Stringbuilder类
- 一个容器便于对字符串进行操作
- 最后还要变回字符串
- 链式编程
```java
StringBuilder AA=new StringBuilder();
AA.append(123).append(345);
```