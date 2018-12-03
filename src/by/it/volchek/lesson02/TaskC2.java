package by.it.volchek.lesson02;



/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/

import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i+j;
        String bin = Integer.toBinaryString(i);
        String binar = Integer.toBinaryString(j);
        String binary = Integer.toBinaryString(k);

        String h = Integer.toHexString(i);
        String he = Integer.toHexString(j);
        String hex = Integer.toHexString(k);

        String oc = Integer.toOctalString(i);
        String oct = Integer.toOctalString(j);
        String octal = Integer.toOctalString(k);

        System.out.print("DEC:");
        System.out.println(i + "+" + j + "=" + k);
        System.out.print("BIN:");
        System.out.printf("%6s%s%5s%s%6s%n", bin, "+", binar, "=" , binary);
        System.out.print("HEX:");
        System.out.printf("%2s%s%2s%s%2s%n", h, "+", he, "=" , hex);
        System.out.print("OCT:");
        System.out.printf("%2s%s%2s%s%2s%n", oc, "+", oct, "=" , octal);

    }


}
