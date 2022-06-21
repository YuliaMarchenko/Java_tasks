package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Реализовать обобщенный метод добавления элементов из листа B в лист A.
        // Ваш метод должен принимать 2 листа совместимых по типу объектов и копировать все элементы из листа B в лист A.

        // Реализовать метод который принимает любой лист и:
        // возвращает лист без дубликатов
        // возвращает лист без дубликатов, при этом сохраняя порядок элементов
        // (т.е. если элемент e1 шел раньше элемента e2 в исходном листе, в результирующем должно быть так же
        // Реализовать данную задачу всеми известными вам способами
    }

    public static <T, G extends T> void copy(List<G> source, List<T> target) {
        for (G s: source){
            target.add(s);
        }
    }

    public static <T> List<T> deduplicate(List<T> list){
        Set<T> result = new HashSet<>();

        for(T element: list){
            result.add(element);
        }

        return new ArrayList<>(result);
    }

    public static <T> List<T> deduplicate2(List<T> list){
        Set<T> set = new HashSet<>();
        List<T> result = new ArrayList<>();

        for(T element: list){
            if (!set.contains(element)){
                result.add(element);
                set.add(element);
            }
        }

        return result;
    }

    public static <T> List<?> copyList(List<? extends T> list1, List<? super T> list2) {

        list2.addAll(list1);

        return list2;

    }
}
