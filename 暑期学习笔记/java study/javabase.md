# java基础 6-21
## 1.第一个程序helloworld
```java
public class Helloworld{
    public static void main(String args[]){
        System.out.println("Hello java.");
    }
}
```
- java万物皆是类
  - System，String都是类
- 主函数声明成静态函数，放在一个类中
### 1.1 编译与运行
- javac.exe   编译器:编译成.class文件
- java.exe  虚拟机启动器:运行 .class 文件
```bash	
javac helloword.java //编译命令
javac -d out java  //指定输出路径
java helloworld  //运行命令

```
### 1.2 环境变量 
系统环境变量是操作系统（例如 Windows、Linux、macOS）提供的一种机制，用于 存储一些关键配置信息，这些信息可以在 系统范围内共享，被操作系统和各种程序访问和使用。

以下是一些常见的环境变量及其用途：

| 环境变量名 | 用途 |
| :--- | :--- |
| PATH | 系统查找可执行程序的目录列表 |
| JAVA_HOME | Java 安装目录 |
| PYTHONPATH | Python 额外模块查找路径 |
| TEMP / TMP | 临时文件存放目录 |
| HOME (Linux) / USERPROFILE (Windows) | 用户主目录路径 |

将jdk\bin 添加到环境路径保证了在任何一个文件夹下我们都可以直接java/javac 而不用显示指定路径

>具体的添加方法，可以先添加一个JAVA_HOME
>再在PATH中引用这个JAVA_HOME

## 2.Java应用
- Java SE（桌面应用）：不占优势，C/C++最适合 
  - IDEA PyCharm
- Java ME（嵌入式或小型设备）：已经凉凉
- java EE（企业级）：Web网站开发，NO.1
  - 企业级 springboot 微服务
  - 移动应用
  - 科学计算 matlab
  - 大数据 hadhoop
  - 游戏 MC
## 3.简单语法
### 3.1  注释
- 单行注释 `\\`
- 多行注释 `\* *\`
- 文档注释 `\\* *\\ ` 
### 3.2 字面量
- 单引号是字符，双引号是字符串，单引号下面要是多个字符就会报错 
 