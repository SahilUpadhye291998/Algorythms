import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
        int target = 0;
        Arrays.sort(input);

        int low = 0;
        int high = input.length - 1;
        for (int i = 0; i < input.length; i++) {
            while (low < high) {
                if (input[low] + input[high] == target) {
                    System.out.println("=================================================");
                    System.out.println(input[low]);
                    System.out.println(input[high]);
                    System.out.println("=================================================");

                    low++;
                    high--;
                } else if (input[low] + input[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
}