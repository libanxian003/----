#java控制流  6-25
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
