package HomeWorkTwo;

import java.util.*;

public class ListMap {
    private final Map<String, List<Integer>> listMap = new HashMap<>();
    private static final Random RANDOM = new Random();

    public ListMap() {
        for (int i = 0; i < 5; i++) {
            listMap.put(String.valueOf(i), generateList());
        }
    }

    public Map<String, Integer> getTransformedCollection() {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<String, List<Integer>> enytry : listMap.entrySet()) {
            int sum = 0;
            for (Integer number:enytry.getValue()) {
                sum += number;

            }
            result.put(enytry.getKey(), sum);

        }
        return result;

    }
    public Set<Map.Entry<String, List<Integer>>> getOriginalMapEntries() {
        return listMap.entrySet();
    }


    private List<Integer> generateList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(RANDOM.nextInt(1001));
        }
        return list;
    }
}
