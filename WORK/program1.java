/* 
Заполнить список десятью случайными числами. 
Отсортировать список методом sort() и вывести его на экран.
*/

package WORK;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * program1
 */
public class program1 {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Random rnd = new Random();
        // double a = Math.random();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(2, 10));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);

    }

}

/*

ОТВЕТ:
[6, 3, 9, 7, 5, 2, 3, 3, 9, 5]
[2, 3, 3, 3, 5, 5, 6, 7, 9, 9]

*/



//////////////////////////////////////////////////////////////////////////////////////

// ИЛИ ВОТ ТАК С ДОПАМИ

// package WORK;

// import java.util.*;

// public class program1 {
// public static void main(String[] args) {
// /*
// * Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

// * */
// List<Integer> arr = new ArrayList<>();
// Random rnd = new Random();
// //double a = Math.random();
// for (int i = 0; i < 10; i++) {
// arr.add(rnd.nextInt(2,10));
// }
// System.out.println(arr);
// arr.sort(new Comparator<Integer>() {
// @Override
// public int compare(Integer o1, Integer o2) {

// return Integer.compare(o2,o1);
// }
// });
// System.out.println(arr);
// Collections.sort(arr);
// System.out.println(arr);

// }

// }

// /*

// ОТВЕТ:
// [2, 3, 6, 2, 9, 2, 2, 4, 6, 9]
// [9, 9, 6, 6, 4, 3, 2, 2, 2, 2]
// [2, 2, 2, 2, 3, 4, 6, 6, 9, 9]

// */