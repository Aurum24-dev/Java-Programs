
import java.util.HashMap;

public class Fruit_in_Basket {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        HashMap<Integer, Integer> h = new HashMap<>();
        int k = 2;
        int l = 0, r = 0, max = 0;

        while (r < arr.length) {
            // Add the current fruit to the basket
            h.put(arr[r], h.getOrDefault(arr[r], 0) + 1);
            
            // Check if we have more than k types of fruits in the basket
            while (h.size() > k) {
                // Remove the leftmost fruit from the basket
                h.put(arr[l], h.get(arr[l]) - 1);
                if (h.get(arr[l]) == 0) {
                    h.remove(arr[l]);
                }
                l++;
            }
            
            // Update the maximum length of the window
            max = Math.max(max, r - l + 1);
            r++;
        }
        
        System.out.println(max);
    }
}
