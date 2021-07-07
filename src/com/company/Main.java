package com.company;
//Пользователь вводит строки клавиатуры. Необходимо сохранить строки в List (каждая строка - отдельный элемент коллекции). Если пользователь ввёл слово “конец”, то:
//Вывести в консоль все сохранённые данные построчно.
//Вывести количество строк в листе.
//Вывести количество символов в самой длинной и самой короткой строке.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        ArrayList<String> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while (!(line = reader.readLine()).equals("конец")) {
                list.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("size of array "+list.size());
        int min=list.get(0).length(),max=list.get(0).length();
        for (String str:list) {
            if (max<str.length()){
                max=str.length();
            }else {
                if (min>str.length()){
                    min=str.length();
                }
            }
            str.length();
            System.out.println(str);
        }
        System.out.println("min length="+min+" max length="+max);
    }
}
