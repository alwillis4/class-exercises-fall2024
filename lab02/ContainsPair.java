import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ContainsPair {
    public static boolean containsPair(List<Integer> l) {
        Map<Integer, Integer> s = new HashMap<Integer, Integer>();
        for (int i = 0; i < l.size(); i++) {
            if (s.containsKey(l.get(i))) {
                return true;
            }
            s.put(l.get(i), 1);
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> list = List.of(1, 2, 3, 4, 5, 3);
        System.out.println(containsPair(list));  // Output: true
    }
}