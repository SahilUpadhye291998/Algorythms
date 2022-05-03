import java.util.*;

public class IntervalListIntersection {
    public static void main(String[] args) {
        // int[][] input1 = {
        // { 0, 2 },
        // { 5, 10 },
        // { 13, 23 },
        // { 24, 25 }
        // };
        // int[][] input2 = {
        // { 1, 5 },
        // { 8, 12 },
        // { 15, 24 },
        // { 25, 26 }
        // };

        int[][] input1 = {
                { 1, 3 },
                { 5, 9 }
        };
        int[][] input2 = {

        };
        int aPointer = 0;
        int bPointer = 0;
        int counter = 0;

        List<List<Integer>> output = new ArrayList<>();

        while (aPointer < input1.length && bPointer < input2.length) {
            if (input2[bPointer][1] >= input1[aPointer][0] && input1[aPointer][1] >= input2[bPointer][0]) {
                ArrayList<Integer> tmp = new ArrayList<>();
                tmp.add(Math.max(input1[aPointer][0], input2[bPointer][0]));
                tmp.add(Math.min(input1[aPointer][1], input2[bPointer][1]));
                output.add(tmp);
            }

            if (input1[aPointer][1] < input2[bPointer][1]) {
                aPointer++;
            } else if (input1[aPointer][1] > input2[bPointer][1]) {
                bPointer++;
            } else {
                aPointer++;
                bPointer++;
            }
            counter++;
        }

        int[][] array = new int[output.size()][output.get(0).size()];
        for (int i = 0; i < output.size(); i++) {
            List<Integer> row = output.get(i);
            for (int j = 0; j < row.size(); j++) {
                array[i][j] = output.get(i).get(j);
            }
        }

    }
}
