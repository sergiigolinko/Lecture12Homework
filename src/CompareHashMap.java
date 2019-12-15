import java.util.HashMap;
import java.util.Map;

public class CompareHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map1=new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        Map<String,Integer> map2=new HashMap<>();
        map2.put("a",1);
        map2.put("b",2);
        map2.put("c",3);
        System.out.println(mapCompare(map1,map2));
    }
    private static boolean mapCompare(Map<String,Integer> map1,Map<String,Integer> map2){
        return map1.entrySet().containsAll(map2.entrySet())&&map2.entrySet().containsAll(map1.entrySet());
    }
}
