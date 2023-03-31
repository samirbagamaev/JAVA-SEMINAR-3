/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа. 
Пройти по списку, найти и удалить целые числа.
*/

package WORK;

import java.util.ArrayList;
import java.util.List;

public class program2 {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>();
        array.add("stroki");
        array.add(4);
        array.add(5);
        array.add("ssd");
        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) instanceof Integer) {
                array.remove(i);
                i--;
            }
        }

        System.out.println(array);

    }

}

/*

ОТВЕТ:
stroki, 4, 5, ssd]
[stroki, ssd]

*/