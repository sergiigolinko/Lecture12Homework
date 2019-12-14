import java.util.*;

public class RandomSetInMap {
    public static void main(String[] args) {
        List<Integer> list = getListOfRandomNumbers();
        // System.out.println(list);
        Set<List<Integer>> set = new HashSet<>();
        set.add(list);
        //System.out.println(set);
        Map<Set<List<Integer>>, List<Integer>> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            list1.add(list.get(i) / 100);
            list1.add(list.get(i) / 10 % 10);
            list1.add(list.get(i) % 10);
        }
        map.put(set, list1);
        System.out.println(map);
    }


    private static List<Integer> getListOfRandomNumbers() {
        int max = 1000;
        int min = 0;
        int dif = max - min;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            list.add(random.nextInt(dif + 1));
        }
        return list;
    }
}
