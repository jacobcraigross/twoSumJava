import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        // main method were we will call the twoSum algo method.
        // this would be the input / spec portion in Leet-code, for example.
        int[] dataSet = new int[] { 2, 7, 11, 15 }; // creating the data set, an array of numbers.
        int target = 13; // are there 2 numbers in the array that add up to this number? --> 5 [2]  +  101 [6]
        int[] result = twoSum(dataSet, target);
        System.out.println("++++++++++ Index for the matching numbers below ++++++++++");
        System.out.println(" index " + result[0] + " and " + "index " + result[1]);
    }

    // takes two inputs, the array of numbers and the target.
    public static int[] twoSum(int[] dataSet, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < dataSet.length; i++) {
            int comp = target - dataSet[i];
            if (numMap.containsKey(comp)) {
                return new int[] {numMap.get(comp), i};
            }
            numMap.put(dataSet[i], i);
        }
        return new int[] {-1, -1};
    }
}
