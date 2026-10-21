import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<Map<String, String>> list = new ArrayList<>();
        
        list.add(Map.of("a", "1", "b", "2", "c", "3"));
        Map<String, String> map = list.get(0);

        System.out.println(list);
        System.out.println(map.get("a"));
               

}
}

