class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] input = new int[] { 3, 4, 5, 1, 2 };
        findPivot(input);
    }

    public static void findPivot(int[] input) {
        int start = 0;
        int end = input.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = ((start + end) / 2);
            if (input[mid] > input[mid + 1]) {
                mid += 1;
                break;
            } else if (input[start] <= input[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(mid);

    }
}