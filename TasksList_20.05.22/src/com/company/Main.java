package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* 1.Есть лист положительных целых чисел нечетной длины >=3.
        Известно, что существует индекс элемента этого листа такой,
        что сумма всех элементов слева от него равняется сумме всех элеменотов справа от него. Найти этот индекс.
        3,2 1 4 1

        2.Найти минимальное количество платформ, требующихся для приема поездов на жд станции.
        Дано время прибытия и отправки поездов .
        List arrivals упорядочен. */
    }

    public static int getIndexSumRightEqualsLeft(List<Integer> numbers) {
        int index = 0;
        int size = numbers.size();
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0, j = size - 1; i < j; i++, j--) {
            leftSum += numbers.get(i);
            rightSum += numbers.get(j);

            while (leftSum < rightSum && i < j) {
                i++;
                leftSum += numbers.get(i);
            }

            while (rightSum < leftSum && i < j) {
                j--;
                rightSum += numbers.get(j);
            }

            if (leftSum == rightSum && i == j)
                index = i;
        }
        return index;
    }


    public static int minPlatforms(List<Integer> arrivals, List<Integer> departures) {
        int platform = 0;
        for (int i = 0; i < arrivals.size(); i++) {
            platform = 1;
            for (int j = 1; j < arrivals.size(); j++) {
                if (Math.max(arrivals.get(i), arrivals.get(j))
                        <= Math.min(departures.get(i), departures.get(j)))
                    platform++;
            }
        }
        return platform;
    }

    public static int minPlatforms2(List<Integer> arrivals, List<Integer> departures) {
        int trains = arrivals.size();
        int platform = 1;
        int i = 0;
        int j = 0;

        if (trains == 0) {
            return 0;
        }

        while (i < trains && j < trains) {
            if (arrivals.get(i) <= departures.get(j)) {
                platform++;
                i++;
            } else if (arrivals.get(i) > departures.get(j)) {
                platform--;
                j++;
            }
        }
        return platform;
    }
}

