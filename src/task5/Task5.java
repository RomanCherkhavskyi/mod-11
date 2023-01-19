package task5;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {

    public static void main(String[] args) {
        //create two lists with data
        List<String> firstList = List.of(new String[]{"Petro", "Yuri", "Roman","Vasyl"});
        List<String> secondList = List.of(new String[]{"Anna", "Iryna", "Ruslana","Victoria","Maria"});

        //create streams
        Stream<String> first = firstList.stream();
        Stream<String> second = secondList.stream();
        //zip two streams from one
        Stream<String> zippedStreams = zip(first, second);
        //show result
        zippedStreams.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIter = first.iterator();           //first name list
        Iterator<T> secondIter = second.iterator();         //second name list
        Stream.Builder<T> builder = Stream.builder();       //builder for create new concat stream
        while (firstIter.hasNext() && secondIter.hasNext()) {   //if we have next names in twice lists
            builder.add(firstIter.next());                      //add name from first list
            builder.add(secondIter.next());}                    //add name from second list
        return builder.build();                             //create new concat stream
    }




    //old code
//    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
//
//        Iterator<T> iterator1 = first.iterator();
//        Iterator<T> iterator2 = second.iterator();
//
//        //create linked list for writing elements of new zipped stream
//        List<T> elements = new LinkedList<>();
//
//        while (iterator1.hasNext() && iterator2.hasNext()) {       //when first stream and second stream has next elements
//            if (iterator1.hasNext()) {
//                elements.add(iterator1.next());                     //write first stream element in linked list
//            }
//
//            if(iterator2.hasNext()) {
//                elements.add(iterator2.next());                     //write second stream element in linked list
//            }
//        }
//
//        return elements.stream();           //create result stream
//    }

}
/*
Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
який "перемішує" елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.
 */



