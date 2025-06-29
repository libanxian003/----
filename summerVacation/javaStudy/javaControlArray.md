## java控制流  6-25
- java中的boolean就是true和false，而不是像C++是0和1
  - 因此不能将整数赋值给boolean
```java
boolean isOdd=ticketNumber%2;  //C++中可以这么写，因为C++中bool就是0还1
boolean isOdd=(ticketNumber%2==1); //java中等价的写法，因为Java中boolean是true和false，不能赋值
```
- switch case的穿透现象
  - 如果不写break，则匹配一句以后，会依次执行下面所有语句（无论是否匹配），包括default
  - 直到遇到break或结束switch case结构
  - JDK12支持新写法，不用break
```java
switch (表达式) {
	case 1->{
    }
	
	case 2->{
    }
		
	default->{
    }
}
```
- continue 用于控制本次循环结束，开始下次循环
- break 结束整个循环
## java数组 6-26
- java数组能体现java面向对象的特点
```java
int[] arr={1,2,3};//能够明显看出java中的数组是当成一个类对象的
```
- arr是一个类对象，可以通过`arr.length`来计算长度，注意length是属性而不是方法
- 注意字符串的长度是通过调用方法来获取的`str.length()`
- 数组的动态初始化
  - 数据类型默认是0
  - String类型默认是空格