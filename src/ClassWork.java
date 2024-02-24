import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassWork {
//N1
//    public static void main(String[] args) {
//        // Создаем список для хранения чисел
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        // Заполняем список десятью случайными числами
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = (int) (Math.random() * 100); // Генерируем случайное число от 0 до 99
//            numbers.add(randomNumber); // Добавляем случайное число в список
//        }
//
//        // Выводим список до сортировки
//        System.out.println("Список до сортировки:");
//        System.out.println(numbers);
//
//        // Сортируем список
//        Collections.sort(numbers);
//
//        // Выводим отсортированный список
//        System.out.println("Список после сортировки:");
//        System.out.println(numbers);
//    }



//N2
//    public static void main(String[] args) {
//        // Создаем список для хранения названий планет
//        ArrayList<String> planets = new ArrayList<>();
//
//        // Заполняем список названиями планет с повторениями
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//        planets.add("Плутон");
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Марс");
//        planets.add("Юпитер");
//
//        // Создаем итератор для списка
//        Iterator<String> iterator = planets.iterator();
//
//        // Создаем список для хранения уникальных названий планет
//        ArrayList<String> uniquePlanets = new ArrayList<>();
//
//        // Создаем список для подсчета повторений
//        ArrayList<Integer> counts = new ArrayList<>();
//
//        // Проходим по списку с помощью итератора
//        while (iterator.hasNext()) {
//            String currentPlanet = iterator.next();
//            // Если планета уже встречалась, увеличиваем счетчик
//            if (uniquePlanets.contains(currentPlanet)) {
//                int index = uniquePlanets.indexOf(currentPlanet);
//                int currentCount = counts.get(index);
//                counts.set(index, currentCount + 1);
//            } else {
//                // Если это новая планета, добавляем ее в список уникальных планет
//                uniquePlanets.add(currentPlanet);
//                counts.add(1);
//            }
//        }
//
//        // Выводим название каждой планеты и количество его повторений в списке
//        for (int i = 0; i < uniquePlanets.size(); i++) {
//            System.out.println(uniquePlanets.get(i) + ": " + counts.get(i));
//        }
//    }


//    N3
//public static void main(String[] args) {
//    // Создаем список для хранения элементов различных типов
//    ArrayList<Object> list = new ArrayList<>();
//
//    // Добавляем строки и целые числа в список
//    list.add("строка 1");
//    list.add(123);
//    list.add("строка 2");
//    list.add(456);
//    list.add("строка 3");
//
//    // Проходим по списку, находим и удаляем целые числа
//    for (int i = 0; i < list.size(); i++) {
//        Object element = list.get(i);
//        if (element instanceof Integer) {
//            list.remove(i);
//            i--; // уменьшаем индекс, чтобы не пропустить следующий элемент после удаления
//        }
//    }
//
//    // Выводим список после удаления целых чисел
//    System.out.println("Список после удаления целых чисел:");
//    for (Object element : list) {
//        System.out.println(element);
//    }
//}
}
