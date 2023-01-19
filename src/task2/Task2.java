package task2;

import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> list = List.of(new String[]{"Ivan", "Yuri", "Roman", "Nazar", "Stepan", "Max", "Igor"});
        System.out.println("sortedList(list) = " + sortedList(list));

        //old code
//        Iterator<String> iterator;
//
//        Stream<String> streamSorted =
//                list.stream()
//                        .map(String::toUpperCase)
//                        .sorted(Comparator.reverseOrder());
//
//        iterator = streamSorted.iterator();
//        System.out.print("streamSorted = ");
//        while (iterator.hasNext())
//            System.out.print(iterator.next()+" ");

    }

    //newcode without iterator. Used method's toUpperCase and reverseOrder
    public static List<String> sortedList(List<String> names){
        return names.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).toList();
    }

}

/*
Метод приймає на вхід список рядків (можна взяти список із Завдання 1).
Повертає список цих рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
 */

/*
public List<String> sortedList(List<String> names){
        return names.stream().map(String::toUpperCase).sorted(Comparator.reverseOrder()).toList());
    }
 */