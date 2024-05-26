/**
 * Main
 */
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        
        HashMap<String, Integer> emp=new HashMap<String, Integer>();
        emp.put("Carl", 1245);
        emp.put("sam", 14987);
        emp.put("Tom", 1367);
        emp.put("Martha", 1562);
        
        System.out.println(emp.containsKey("Thomas"));
        System.out.println(emp.containsValue(1245));
        System.out.println(emp.size());
        System.out.println(emp);

        emp.putIfAbsent("marian", 7856);
        System.out.println(emp);
    }
}