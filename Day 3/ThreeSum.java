import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        Arrays.sort(input);
        List<List<Integer>> output = new ArrayList();

        for (int i = 0; i < input.length - 2; i++) {
            if (i == 0 || (i > 0 && input[i] == input[i - 1])) {
                continue;
            }

            int low = i + 1;
            int high = input.length - 1;
            int sum = 0 - input[i];
            while (low < high) {
                if (input[low] + input[high] == sum) {
                    output.add(Arrays.asList(input[i], input[low], input[high]));
                    while (low < high && input[low] == input[low + 1]) {
                        low++;
                    }
                    while (low < high && input[high] == input[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (input[low] + input[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
}