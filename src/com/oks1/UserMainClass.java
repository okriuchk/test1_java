package com.oks1;

import java.util.*;

public class UserMainClass {
    String name;
    int age;

    public static void main(String[] args) {

        //метод, который принимает на вход 2 листа и возвращает лист, состоящий только из тех элементов, которые присутствуют в обоих листах
        ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 13, 59, 8, 4));
        ArrayList<Integer> listB = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 8));

        RepeatListANDSet<Integer> a = new RepeatListANDSet<>();
        System.out.println("LIST of repeating elements: " + a.repeatinglist(listA, listB) + "\n");

        //метод, который принимает на вход 2 набора и возвращает набор, состоящий только из тех элементов, которые присутствуют в обоих наборах
        Set<Integer> repeatHashSet1 = new HashSet<>();
        Set<Integer> repeatHashSet2 = new HashSet<>();
        repeatHashSet1.addAll(Arrays.asList(1, 13, 4, 5, 6, 17, 8, 9, 20));
        repeatHashSet2.addAll(Arrays.asList(0, 31, 5, 9, 11));

        RepeatListANDSet<Integer> ab = new RepeatListANDSet<>();
        System.out.println("SET of repeating elements: " + ab.repeatingset(repeatHashSet1, repeatHashSet2) + "\n");

        //итерация по ArrayList с несколькими элементами с выводом на консоль информации в виде: <индекс>: <элемент>
        List <Integer> testList = new ArrayList <>(Arrays.asList(1,3,3,4,4));
        IterationList <Integer> LIST = new IterationList <>();
        System.out.println("Iteration List:");
        System.out.println(LIST.GetIterationList(testList.iterator()));
        //после результатов в консоли повторяется 'java.io.PrintStream@7c3df479'. вроде дело в кодировке, но не смогла разобраться

        //итерация по HashSet с несколькими элементами с выводом на консоль информации в виде: <элемент>
        Set <Integer> testSet = new HashSet <>(Arrays.asList(12, 33, 55, 44, 33, 4));
        IterationSet <Integer> SET = new IterationSet <>();
        System.out.println("\nIteration Set:");
        System.out.println(SET.GetIterationSet(testSet.iterator()));
        //после результатов в консоли повторяется 'java.io.PrintStream@7c3df479'. вроде дело в кодировке, но не смогла разобраться

        // итерация по HashMap с несколькими элементами с выводом на консоль информации в виде:
        // 1.итерация по ключам: <ключ>
        // 2.итерация по значениям: <значение>
        // 3.итерация по парам: <ключ>: <значение> - не получилось до конца
        Map <Integer, String> map1 = new HashMap<>();
        map1.put(68,"Otto");
        map1.put(1,"Peter");
        map1.put(26,"Оксана");
        map1.put(3,"Ütte");
        map1.put(101,"Алекс");

        IterationMap <Integer, String> map = new IterationMap <>();
        System.out.println("\nIteration Map by KEY:\n" + map.GetIterationMap(map1,TypeMap.key)); // 1.итерация по ключам: <ключ>: <значение>
        System.out.println("Iteration Map by VALUE:\n" + map.GetIterationMap(map1,TypeMap.value) + "\n"); // 2.итерация по значениям: <значение>
        //System.out.println("Iteration Map by PAIRS:\n" + map.GetIterationMap(map1,TypeMap.key, map1) + ":" + map.GetIterationMap(map1,TypeMap.value, map1)); // 3.итерация по парам: <ключ>: <значение>
    }
}