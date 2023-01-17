package task2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        List<String> list = List.of(new String[]{"Ivan", "Yuri", "Roman", "Nazar", "Stepan", "Max", "Igor"});

        Iterator<String> iterator;

        Stream<String> streamSorted =
                list.stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.reverseOrder());

        iterator = streamSorted.iterator();
        System.out.print("streamSorted = ");
        while (iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }
}




/*
Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
 */
