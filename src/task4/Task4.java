package task4;

import java.util.stream.Stream;

public class Task4 {

    private static final long a = 25214903917L;
    private static final long c = 11L;
    private static final long m = 2L^48;
    public static void main(String[] args) {


        getRandom(a,c,m).limit(60)
                .forEach(x -> System.out.println(x));

        //oldcode
//        Stream.iterate(xseed, xseed -> generator(xseed))
//                .limit(60)
//                .forEach(x -> System.out.println(x));

    }

    public  static Stream<Long> getRandom(long a, long c, long m) {
        return Stream.iterate(0L, x -> (a * x + c) % m);
    }


    //old code
//    public static long generator(long value){
//        return (a * value + c) % m;
//    }

}
/*
Використовуючи Stream.iterate, створіть безкінечний стрім випадкових чисел, але не використовуючи Math.random().

Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте
за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.

Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.

Для тесту використовуйте такі дані:

a = 25214903917
c = 11
m = 2^48 (2в степені48`)
 */

/*
public  Stream<Long> getRandom(long a, long c, long m) {
 return Stream.iterate(0L, x -> (a * x + c) % m);
}
 */
