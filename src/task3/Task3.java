package task3;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        String[] array = {"1, 2, 0", "4, 5"};
        System.out.println("sortNumbers(array) = " + sortNumbers(array));

        //old code
//        System.out.println("Task 3 result: " +
//                Arrays.stream(rebuildArray(array))
//                        .filter(chars -> Character.isDigit(chars.charAt(0)))
//                        .sorted(Comparator.naturalOrder())
//                        .collect(Collectors.joining(","))
//                        .toString());
    }

    //
    public static String sortNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .map(x -> Arrays.asList(x.split(", ")))     //split numbers
                .flatMap(list -> list.stream())                   //write numbers in stream
                .sorted()                                       //sorted
                .collect(Collectors.joining(", "));     //and create stream with delimiter ", "
    }

    //old code
//    private static String[] rebuildArray(String[] array) {
//        String line = "";
//        String[] result = {};
//        char[] temp = {};
//        List<String> arrayList = new ArrayList<String>();
//        //String line create
//        for (int i = 0; i < array.length; i++) {
//            line += array[i];
//        }
//        //rebuild line to char array
//        temp = line.toCharArray();
//
//        //create new array, when includes only digits
//        for (int i = 0; i < temp.length; i++) {
//            if (Character.isDigit(temp[i])){
//                arrayList.add(String.valueOf(temp[i]));
//            }
//        }
//        //create rebuildered array
//        result = arrayList.toArray(new String[0]);
////        System.out.println("rebuildered array = " + Arrays.toString(result));
//        return result;
//    }
}

/*
Є масив:

["1, 2, 0", "4, 5"]

Необхідно отримати з масиву всі числа, і вивести їх у відсортованому вигляді через кому ,, наприклад:

"0, 1, 2, 4, 5"

 */

/*
public String sortNumbers(String[] numbers) {
        return Arrays.stream(numbers)
                .map(x -> Arrays.asList(x.split(", ")))
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.joining(", "));
    }
 */
