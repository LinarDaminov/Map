package HomeWorkOne;

import java.util.HashMap;
import java.util.Map;

public class PhoneDirectory {

    public static void main(String[] args) {
        System.out.println("Task 1");

        HashMap<String, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Иванов Иван", "89984450203");
        phoneDirectory.put("Петров Петр", "8998325453");
        phoneDirectory.put("Сидоров Сидр", "89982448203");
        phoneDirectory.put("Алексеев Алексей", "87884450203");
        phoneDirectory.put("Александров Александр", "8966640203");
        phoneDirectory.put("Максимов Максим", "8998777777");
        phoneDirectory.put("Данилов Данил", "899844889");
        phoneDirectory.put("Дмитриев Дмитрий", "89984451113");
        phoneDirectory.put("Романов Роман", "899848960203");
        phoneDirectory.put("Кондратов Кондрат", "89984450203");
        phoneDirectory.put("Мариева Мария", "8998499203");
        phoneDirectory.put("Натальева Наталья", "87984450203");
        phoneDirectory.put("Оксаненко Оксана", "81984450203");
        phoneDirectory.put("Татьянина Татьяна", "83984450203");
        phoneDirectory.put("Кириллов Кирилл", "89994450203");
        phoneDirectory.put("Стасов Стас", "89984450103");
        phoneDirectory.put("Верина Вера", "899844502663");
        phoneDirectory.put("Харитонов Харитон", "89978450203");
        phoneDirectory.put("Ольгина Ольга", "89984451403");
        phoneDirectory.put("Игорев Игорь", "89984450153");

        System.out.println("Фамилия Имя:" + phoneDirectory.keySet());
        System.out.println("Номер:" + phoneDirectory.values());


        System.out.println("Task 3");
       Map<String,Integer> map = new HashMap<>();
        map.put("Один",1);
        map.put("Два",2);
        map.put("Три",3);
        map.put("Четыре",4);
        map.put("Пять",5);
        System.out.println("Значение: " + map.values());
        System.out.println("Номер: " + map.keySet());

        map.putIfAbsent("Шесть", 6);
    }

    public static void addNumber(Map <String, Integer  > map)
    {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.containsKey("")) {
                map.put("key", 1);
            } else {
                throw new RuntimeException("Данное значение уже присутствует");
            }
        }
    }
}
