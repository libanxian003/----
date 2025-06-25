import java.util.Scanner;
public class Mod{
    public static void main(String args[]){
        System.out.println("Please input a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int hundreds=num/100;
        int lastTwoDigits=num%100;
        int tens=lastTwoDigits/10;
        int ones=lastTwoDigits%10;
        System.out.println("百位数: " + hundreds);
        System.out.println("十位数: " + tens);
        System.out.println("个位数: " + ones);
        sc.close();
    }
}
/* 
 * 核心思想
通过 循环 和 取模运算 从右到左（个位开始）逐位提取数字，存入数组或列表。

步骤分解
从个位开始提取：

用 num % 10 获取当前最低位数字。

用 num / 10 去掉已提取的位。

重复直到数字变为 0。
  */