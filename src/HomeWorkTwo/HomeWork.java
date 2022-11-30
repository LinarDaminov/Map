package HomeWorkTwo;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

       //Task 2
//        Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
//        Выведите в консоль всё содержимое коллекции в порядке добавления (в формате "ключ:значение")
        Map<Integer, String> num = new LinkedHashMap<>();
        num.put(3, "Three");
        num.put(6, "Six");
        num.put(5, "Five");
        num.put(9, "Nine");
        for (Map.Entry<Integer, String> entry : num.entrySet()) {
            System.out.printf("%d:%s%n", entry.getKey(), entry.getValue());
        }
    }
}
