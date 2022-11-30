package HomeWorkOne;

import java.util.HashMap;
import java.util.Map;

public class TasksThree {
    private final Map<String, Integer> map = new HashMap<>();


    public void addStringAndInteger(String key, int value) {
        if (!map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value) {
                throw new IllegalArgumentException("Ошибка");
            } else {
                map.put(key, valueFromMap + value);
            }
        }

    }
}
