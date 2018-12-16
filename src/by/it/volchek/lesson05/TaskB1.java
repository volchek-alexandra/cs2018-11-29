package by.it.volchek.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> str  = new ArrayList<>();
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        String s1 = "Так думал молодой повеса,";
        String s2 ="Летя в пыли на почтовых";
        String s3= "Всевышней волею Зевеса";
        String s4 = "Наследник всех своих родных.";
        String s5 = "А. С. Пушкин";
        str.add (s1);
        str.add (s2);
        str.add (s3);
        str.add (s4);
        str.add (s5);
        int n = str.size();
        System.out.println(n);
        for (int i = str.size(); i > 0 ; i--) {
            int j = str.size() - i;
            System.out.println(str.get(j));
        }


    }

}
