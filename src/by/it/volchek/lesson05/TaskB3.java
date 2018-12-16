package by.it.volchek.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int c, n1 = 1, n2=1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            m[i]= sc.nextInt();
        }
        int min = m[0];
        int max=m[0];
        for (int i =2 ; i <=10; i++) {
            if (m[i-1]<min) n1=i;
            if (m[i-1]>max) n2=i;


        for (int k = 1; k < m.length; k++) {
            for (int j = m.length-1; j>=k  ; j--) {
                if (m[j-1]>m[j]){
                    c=m[j-1];
                    m[j-1]=m[j];
                    m[j]=c;
                }


            }

        }

        }
        System.out.println("Index of first element=" + n1);
        System.out.println("Index of last element=" + n2);

    }

}
