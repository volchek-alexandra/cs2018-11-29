package by.it.volchek.lesson05;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 целых чисел и записать их в массив.
3. Найти минимальный и максимальный элементы массива.
4. Вывести эти два элемента на экран, через пробел.

Например, для такого ввода
1 2 3 4 5 6 7 8 9 0

вывод ожидается такой
0 9
*/

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] a = new int [10];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = sc.nextInt();


        }
        int min=a[0];
        int max=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]<min)
                min = a[i];
            if (a[i]>max)
                max = a[i];
            System.out.println(min+" "+max);



        }

        }
    }


