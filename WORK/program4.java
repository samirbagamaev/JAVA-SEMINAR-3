/*Заполнить список названиями планет Солнечной системы
в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
*/

package WORK;

import java.util.ArrayList;
import java.util.List;

public class program4 {
    public static void main(String[] args) {
        List<String> planets = List.of("Марс", "Венера", "Земля", "Юпитер", "Уран",
                "Нептун", "Плутон", "Меркурий", "Сатурн");
        List<String> listPlanets = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listPlanets.add(planets.get((int) (Math.random() * planets.size())));
        }
        System.out.println(listPlanets);
        for (String planet : planets) {
            int count = 0;
            for (String item : listPlanets) {
                if (planet.equals(item)) {
                    count++;
                }
            }
            System.out.println(planet + ": " + count);
        }
    }
}


/* 

ОТВЕТ: 
[Сатурн, Юпитер, Марс, Плутон, Меркурий, Юпитер, Марс, Меркурий, Плутон, Юпитер, Юпитер, Плутон, Земля, Марс, Плутон, Уран, Нептун, Плутон, Уран, Земля, Марс, Сатурн, Плутон, Плутон, Юпитер, Юпитер, Сатурн, Меркурий, Юпитер, Юпитер]        
Марс: 4  
Венера: 0
Земля: 2 
Юпитер: 8
Уран: 2
Нептун: 1
Плутон: 7
Меркурий: 3
Сатурн: 3

*/