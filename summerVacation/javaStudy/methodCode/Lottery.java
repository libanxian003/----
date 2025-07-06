package summerVacation.javaStudy.methodCode;

import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        int[] lottery = {2, 588, 888, 1000, 10000};
        Random r = new Random();

        // Fisher-Yates 洗牌算法
        for (int i = lottery.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1); // 生成 [0, i] 的随机整数
            switchNumber(lottery, i, j); // 传入数组和索引进行交换
        }

        // 打印打乱后的数组
        for (int num : lottery) {
            System.out.println(num);
        }
    }

    // 交换数组中的两个元素
    public static void switchNumber(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}