import java.util.*;

public class RandomListInMap {
    public static void main(String[] args) {
        List<Integer> numbers=getListOfRandomNumbers();
        //System.out.println(numbers);
        Map<Integer, Integer> map=new HashMap<>();
        for (Integer i:numbers
             ) {
            if(map.keySet().contains(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }

        }
        System.out.println(map);

    }
    private static List<Integer> getListOfRandomNumbers(){
        int max=99;
        int min=0;
        int dif=max-min;
        Random random=new Random();
        List<Integer> numbers=new ArrayList<>();
        for (int i = 0; i <max ; i++) {
            numbers.add(random.nextInt(dif+1));
        }
        return numbers;
    }
}
