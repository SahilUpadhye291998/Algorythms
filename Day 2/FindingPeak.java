public class FindingPeak {
    public static void main(String[] args) {
        int[] input = new int[] { 1, 2, 1, 3, 4, 5, 1 };
        int low = 0;
        int high = input.length - 1;
        int mid = 0;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (input[mid] < input[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(low);

    }
}
