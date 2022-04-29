public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] input = {
                { 1, 3, 4, 6 },
                { 7, 9, 10, 12 },
                { 14, 17, 19, 20 },
                { 23, 26, 27, 29 }
        };
        int target = 17;
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            int first = input[i][0];
            int second = input[i][input[i].length - 1];
            if (first <= target && second >= target) {
                counter = i;
            }
        }

        boolean output = false;
        for (int i = 0; i < input[counter].length; i++) {
            if (input[counter][i] == target) {
                output = true;
            }
        }
    }

}
