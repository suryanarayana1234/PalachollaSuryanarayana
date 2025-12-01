
// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
//   (examples)
//   input: [1,2,8,9,12,46,76,82,15,20,30]
//   Output: 
//     {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}







import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // LinkedHashMap to maintain order 1 to 9
        Map<Integer, Integer> result = new LinkedHashMap<>();

        // Initialize 1 to 9 with 0 count
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Count multiples
        for (int num : arr) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }

        System.out.println(result);
    }
}
