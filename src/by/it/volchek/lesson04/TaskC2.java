package by.it.volchek.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int d = sc.nextInt();
        int m = sc.nextInt();
        int day =0;
for (int month=2; month<=m; month++) {
    if (month==2||month==4||month==6||month==8||month==9||month==11)
    day+=31;
    else if (month==3)
        day+=28;
    else day+=30;
    }
        System.out.println(day+=d);
    }

}
