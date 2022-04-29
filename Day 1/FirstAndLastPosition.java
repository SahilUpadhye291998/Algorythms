/**
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * -----------------------------------------------------------------------------------------------------------------------------
 * Prefered approch to solve the issue.
 * we Will use binary sort to get the specific element and then we will see the
 * next largest element
 * [] we will start with implementing the binary search application
 * [] Then we will find the first lowest element
 * [] then we will find the last target element from the array
 */
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4, 4, 5, 5, 5, 6, 6, 7 };
        int target = 5;
        binarySearch(input, target);
    }

    private static int[] binarySearch(int[] input, int target) {
        if (input.length == 0) {
            return new int[] { -1, -1 };
        }
        int low = 0;
        int high = input.length;
        System.out.println(high);
        int firstIndex = -1;
        int lastIndex = -1;
        while (low <= high) {
            int mid = ((high + low) / 2);
            if (input[mid] < target) {
                low = mid + 1;
            } else if (input[mid] > target) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }

        low = 0;
        high = input.length;

        while (low <= high) {
            int mid = ((high + low) / 2);

            if (input[mid] < target) {
                low = mid + 1;
            } else if (input[mid] > target) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        System.out.println(firstIndex);
        System.out.println(lastIndex);
        if (firstIndex == lastIndex && firstIndex == -1) {
            return new int[] { -1, -1 };
        } else if (firstIndex != -1 && lastIndex == -1) {
            return new int[] { firstIndex, firstIndex };
        } else if (firstIndex == -1 && lastIndex != -1) {
            return new int[] { lastIndex, lastIndex };
        } else {
            return new int[] { firstIndex, lastIndex };
        }
    }
}
