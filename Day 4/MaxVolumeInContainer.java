public class MaxVolumeInContainer {
    public static void main(String[] args) {
        int[] input = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int water = 0;
        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            water = Math.max(water, Math.min(input[left], input[right]) * (right - left));
            if (input[left] > input[right]) {
                right--;
            } else {
                left++;
            }
        }
        System.out.println(water);
    }
}
