import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        //Ввод числа в консоль: нечётное == true
        out.println(isOdd (scanner.nextInt()));
        // Ввод N для вычисления всех чисел до N
        out.println(sumNum(scanner.nextInt()));
    }
    // Нечётное значение возвращает True
    public static boolean isOdd( int value){
        if (value % 2 > 0) return true;
        return false;
    }
    // Считаем сумму всех чисел
    public static int sumNum(int n){
        int sumN = 0;
        for (int i = 1; i <= n; i++) {
            sumN += i;
        }
        return sumN;
    }
}