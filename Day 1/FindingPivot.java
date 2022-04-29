public class FindingPivot {
    public static void main(String[] args) {
        int[] input = new int[] { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int[] index = findPivot(input, target);
        int output = search(input, target, index);
    }

    public static int search(int[] input, int target, int[] index) {
        int elementIndex = -1;

        int low = index[0];
        int high = index[1];

        int mid = 0;

        if (input[low] <= target && input[input.length - 1] >= target) {
            System.out.println("OK we are here");
            high = input.length - 1;
        } else {
            low = 0;
        }

        while (low <= high) {
            mid = ((high + low) / 2);
            if (input[mid] < target) {
                low = mid + 1;
            } else if (input[mid] > target) {
                high = mid - 1;
            } else {
                elementIndex = mid;
                break;
            }
        }

        System.out.println(elementIndex);

        return elementIndex;
    }

    public static int[] findPivot(int[] input, int target) {
        int[] index = new int[] { 0, 0 };

        if (input[0] < input[input.length - 1]) {
            return new int[] { 0, input.length - 1 };
        }

        int start = 0;
        int end = input.length - 1;

        int mid = 0;
        while (start <= end) {
            mid = ((start + end) / 2);
            if (input[mid] > input[mid + 1]) {
                mid = mid + 1;
                break;
            } else if (input[start] <= input[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        index[0] = mid;
        index[1] = mid - 1;

        System.out.println(index[0]);
        System.out.println(index[1]);

        return index;
    }
}
