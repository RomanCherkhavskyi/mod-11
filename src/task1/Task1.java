package task1;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {

    public static void main(String[] args) {
        List<String> list = List.of(new String[]{"Ivan", "Yuri", "Roman", "Nazar", "Stepan", "Max", "Igor"});

        System.out.println("retOddNames(list) = " + retOddNames(list));
    }

    public static String retOddNames(List<String> list){
        return IntStream.range(0, list.size())
                .boxed()
                .map(number -> removeOdd(number, list))
                .collect(Collectors.joining());
    }

    public static String removeOdd(int number, List<String> list){
        return number % 2 != 0 ? number + "." + list.get(number) + " " : "";
    }

}

/*
Метод приймає на вхід список імен.
Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
 */
